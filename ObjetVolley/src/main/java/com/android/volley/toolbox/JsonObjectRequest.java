/*
 * Copyright (C) 2011 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.volley.toolbox;

import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.io.UnsupportedEncodingException;

/**
 * A request for retrieving a {@link JSONObject} response body at a given URL, allowing for an
 * optional {@link JSONObject} to be passed in as part of the request body.
 */
public class JsonObjectRequest extends JsonRequest<Object> {
    private Class aClass;

    /**
     * Creates a new request.
     * @param method the HTTP method to use
     * @param url URL to fetch the JSON from
     * @param jsonRequest A {@link JSONObject} to post with the request. Null is allowed and
     *   indicates no parameters will be posted along with request.
     * @param listener Listener to receive the JSON response
     * @param errorListener Error listener, or null to ignore errors.
     */
    public JsonObjectRequest(int method, String url, JSONObject jsonRequest,
            Listener<Object> listener, ErrorListener errorListener,Class aClass) {
        super(method, url, (jsonRequest == null) ? null : jsonRequest.toString(), listener,
                    errorListener);
        this.aClass=aClass;

    }

    /**
     * Constructor which defaults to <code>GET</code> if <code>jsonRequest</code> is
     * <code>null</code>, <code>POST</code> otherwise.
     *
     * @see #JsonObjectRequest(int, String, JSONObject, Listener, ErrorListener,Class)
     */
    public JsonObjectRequest(String url, JSONObject jsonRequest, Listener<Object> listener,
            ErrorListener errorListener,Class aClass) {
        this(jsonRequest == null ? Method.GET : Method.POST, url, jsonRequest,
                listener, errorListener,aClass);
    }

    @Override
    protected Response<Object> parseNetworkResponse(NetworkResponse response) {
        try {

            String s = "{\n" +
                    "    \"name\": \"sample\",\n" +
                    "    \"def\": [\n" +
                    "        {\n" +
                    "            \"setId\": 1,\n" +
                    "            \"setDef\": [\n" +
                    "                {\n" +
                    "                    \"name\": \"ABC\",\n" +
                    "                    \"type\": \"STRING\"\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"name\": \"XYZ\",\n" +
                    "                    \"type\": \"STRING\"\n" +
                    "                }\n" +
                    "            ]\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"setId\": 2,\n" +
                    "            \"setDef\": [\n" +
                    "                {\n" +
                    "                    \"name\": \"abc\",\n" +
                    "                    \"type\": \"STRING\"\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"name\": \"xyz\",\n" +
                    "                    \"type\": \"STRING\"\n" +
                    "                }\n" +
                    "            ]\n" +
                    "        }\n" +
                    "    ]\n" +
                    "}";
            String jsonString = new String(response.data,
                    HttpHeaderParser.parseCharset(response.headers, PROTOCOL_CHARSET));
            Gson gson = new Gson();
            Object fromJson = gson.fromJson(s, aClass);
            return Response.success(fromJson,
                    HttpHeaderParser.parseCacheHeaders(response));
        } catch (UnsupportedEncodingException e) {
            return Response.error(new ParseError(e));
        }
    }
}
