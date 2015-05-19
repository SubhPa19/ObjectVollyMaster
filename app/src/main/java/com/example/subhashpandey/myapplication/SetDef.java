package com.example.subhashpandey.myapplication;

import com.google.gson.annotations.Expose;

public class SetDef {

@Expose
private String name;
@Expose
private String type;

/**
*
* @return
* The name
*/
public String getName() {
return name;
}

/**
*
* @param name
* The name
*/
public void setName(String name) {
this.name = name;
}

/**
*
* @return
* The type
*/
public String getType() {
return type;
}

/**
*
* @param type
* The type
*/
public void setType(String type) {
this.type = type;
}

}
