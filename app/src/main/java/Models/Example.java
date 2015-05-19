package Models;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

public class Example {

@Expose
private String $id;
@Expose
private long QuestionId;
@Expose
private String QuestionDescription;
@Expose
private boolean IsCategory;
@Expose
private Object ParentQuestion;
@Expose
private long Order;
@Expose
private long SubOrder;
@Expose
private long QuesType;
@Expose
private Object QuestionType;
@Expose
private Object Options;
@Expose
private long GroupId;
@Expose
private long QuesVersion;
@Expose
private boolean IsMandatory;
@Expose
private Object OptionDescription;
@Expose
private List<Child> Children = new ArrayList<Child>();
@Expose
private long ParentId;
@Expose
private Object Parent;
@Expose
private long Level;

/**
*
* @return
* The $id
*/
public String get$id() {
return $id;
}

/**
*
* @param $id
* The $id
*/
public void set$id(String $id) {
this.$id = $id;
}

/**
*
* @return
* The QuestionId
*/
public long getQuestionId() {
return QuestionId;
}

/**
*
* @param QuestionId
* The QuestionId
*/
public void setQuestionId(long QuestionId) {
this.QuestionId = QuestionId;
}

/**
*
* @return
* The QuestionDescription
*/
public String getQuestionDescription() {
return QuestionDescription;
}

/**
*
* @param QuestionDescription
* The QuestionDescription
*/
public void setQuestionDescription(String QuestionDescription) {
this.QuestionDescription = QuestionDescription;
}

/**
*
* @return
* The IsCategory
*/
public boolean isIsCategory() {
return IsCategory;
}

/**
*
* @param IsCategory
* The IsCategory
*/
public void setIsCategory(boolean IsCategory) {
this.IsCategory = IsCategory;
}

/**
*
* @return
* The ParentQuestion
*/
public Object getParentQuestion() {
return ParentQuestion;
}

/**
*
* @param ParentQuestion
* The ParentQuestion
*/
public void setParentQuestion(Object ParentQuestion) {
this.ParentQuestion = ParentQuestion;
}

/**
*
* @return
* The Order
*/
public long getOrder() {
return Order;
}

/**
*
* @param Order
* The Order
*/
public void setOrder(long Order) {
this.Order = Order;
}

/**
*
* @return
* The SubOrder
*/
public long getSubOrder() {
return SubOrder;
}

/**
*
* @param SubOrder
* The SubOrder
*/
public void setSubOrder(long SubOrder) {
this.SubOrder = SubOrder;
}

/**
*
* @return
* The QuesType
*/
public long getQuesType() {
return QuesType;
}

/**
*
* @param QuesType
* The QuesType
*/
public void setQuesType(long QuesType) {
this.QuesType = QuesType;
}

/**
*
* @return
* The QuestionType
*/
public Object getQuestionType() {
return QuestionType;
}

/**
*
* @param QuestionType
* The QuestionType
*/
public void setQuestionType(Object QuestionType) {
this.QuestionType = QuestionType;
}

/**
*
* @return
* The Options
*/
public Object getOptions() {
return Options;
}

/**
*
* @param Options
* The Options
*/
public void setOptions(Object Options) {
this.Options = Options;
}

/**
*
* @return
* The GroupId
*/
public long getGroupId() {
return GroupId;
}

/**
*
* @param GroupId
* The GroupId
*/
public void setGroupId(long GroupId) {
this.GroupId = GroupId;
}

/**
*
* @return
* The QuesVersion
*/
public long getQuesVersion() {
return QuesVersion;
}

/**
*
* @param QuesVersion
* The QuesVersion
*/
public void setQuesVersion(long QuesVersion) {
this.QuesVersion = QuesVersion;
}

/**
*
* @return
* The IsMandatory
*/
public boolean isIsMandatory() {
return IsMandatory;
}

/**
*
* @param IsMandatory
* The IsMandatory
*/
public void setIsMandatory(boolean IsMandatory) {
this.IsMandatory = IsMandatory;
}

/**
*
* @return
* The OptionDescription
*/
public Object getOptionDescription() {
return OptionDescription;
}

/**
*
* @param OptionDescription
* The OptionDescription
*/
public void setOptionDescription(Object OptionDescription) {
this.OptionDescription = OptionDescription;
}

/**
*
* @return
* The Children
*/
public List<Child> getChildren() {
return Children;
}

/**
*
* @param Children
* The Children
*/
public void setChildren(List<Child> Children) {
this.Children = Children;
}

/**
*
* @return
* The ParentId
*/
public long getParentId() {
return ParentId;
}

/**
*
* @param ParentId
* The ParentId
*/
public void setParentId(long ParentId) {
this.ParentId = ParentId;
}

/**
*
* @return
* The Parent
*/
public Object getParent() {
return Parent;
}

/**
*
* @param Parent
* The Parent
*/
public void setParent(Object Parent) {
this.Parent = Parent;
}

/**
*
* @return
* The Level
*/
public long getLevel() {
return Level;
}

/**
*
* @param Level
* The Level
*/
public void setLevel(long Level) {
this.Level = Level;
}

}
