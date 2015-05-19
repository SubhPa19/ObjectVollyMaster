package com.example.subhashpandey.myapplication;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

public class Def {

@Expose
private Integer setId;
@Expose
private List<SetDef> setDef = new ArrayList<SetDef>();

/**
* 
* @return
* The setId
*/
public Integer getSetId() {
return setId;
}

/**
* 
* @param setId
* The setId
*/
public void setSetId(Integer setId) {
this.setId = setId;
}

/**
* 
* @return
* The setDef
*/
public List<SetDef> getSetDef() {
return setDef;
}

/**
* 
* @param setDef
* The setDef
*/
public void setSetDef(List<SetDef> setDef) {
this.setDef = setDef;
}

}