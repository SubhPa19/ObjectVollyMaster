package Models;

import com.google.gson.annotations.Expose;

public class Parent {

@Expose
private String $ref;

/**
*
* @return
* The $ref
*/
public String get$ref() {
return $ref;
}

/**
*
* @param $ref
* The $ref
*/
public void set$ref(String $ref) {
this.$ref = $ref;
}

}
