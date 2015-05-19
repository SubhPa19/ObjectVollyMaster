package com.example.subhashpandey.myapplication;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

public class Example {

@Expose
private String name;
@Expose
private List<Def> def = new ArrayList<Def>();

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
* The def
*/
public List<Def> getDef() {
return def;
}

/**
* 
* @param def
* The def
*/
public void setDef(List<Def> def) {
this.def = def;
}

}

