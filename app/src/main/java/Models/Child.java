package Models;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

public class Child {

    @Expose
    private String $id;
    @Expose
    private long QuestionId;
    @Expose
    private String QuestionDescription;
    @Expose
    private boolean IsCategory;
    @Expose
    private String ParentQuestion;
    @Expose
    private long Order;
    @Expose
    private long SubOrder;
    @Expose
    private long QuesType;
    @Expose
    private String QuestionType;
    @Expose
    private String Options;
    @Expose
    private long GroupId;
    @Expose
    private long QuesVersion;
    @Expose
    private boolean IsMandatory;
    @Expose
    private String OptionDescription;
    @Expose
    private List<Child> Children = new ArrayList<Child>();
    @Expose
    private long ParentId;
    @Expose
    private Models.Parent Parent;
    @Expose
    private long Level;

    public String get$id() {
        return $id;
    }

    public void set$id(String $id) {
        this.$id = $id;
    }

    public long getQuestionId() {
        return QuestionId;
    }

    public void setQuestionId(long questionId) {
        QuestionId = questionId;
    }

    public String getQuestionDescription() {
        return QuestionDescription;
    }

    public void setQuestionDescription(String questionDescription) {
        QuestionDescription = questionDescription;
    }

    public boolean isCategory() {
        return IsCategory;
    }

    public void setCategory(boolean isCategory) {
        IsCategory = isCategory;
    }

    public String getParentQuestion() {
        return ParentQuestion;
    }

    public void setParentQuestion(String parentQuestion) {
        ParentQuestion = parentQuestion;
    }

    public long getOrder() {
        return Order;
    }

    public void setOrder(long order) {
        Order = order;
    }

    public long getSubOrder() {
        return SubOrder;
    }

    public void setSubOrder(long subOrder) {
        SubOrder = subOrder;
    }

    public long getQuesType() {
        return QuesType;
    }

    public void setQuesType(long quesType) {
        QuesType = quesType;
    }

    public String getQuestionType() {
        return QuestionType;
    }

    public void setQuestionType(String questionType) {
        QuestionType = questionType;
    }

    public String getOptions() {
        return Options;
    }

    public void setOptions(String options) {
        Options = options;
    }

    public long getGroupId() {
        return GroupId;
    }

    public void setGroupId(long groupId) {
        GroupId = groupId;
    }

    public long getQuesVersion() {
        return QuesVersion;
    }

    public void setQuesVersion(long quesVersion) {
        QuesVersion = quesVersion;
    }

    public boolean isMandatory() {
        return IsMandatory;
    }

    public void setMandatory(boolean isMandatory) {
        IsMandatory = isMandatory;
    }

    public String getOptionDescription() {
        return OptionDescription;
    }

    public void setOptionDescription(String optionDescription) {
        OptionDescription = optionDescription;
    }

    public List<Child> getChildren() {
        return Children;
    }

    public void setChildren(List<Child> children) {
        Children = children;
    }

    public long getParentId() {
        return ParentId;
    }

    public void setParentId(long parentId) {
        ParentId = parentId;
    }

    public Parent getParent() {
        return Parent;
    }

    public void setParent(Parent parent) {
        Parent = parent;
    }

    public long getLevel() {
        return Level;
    }

    public void setLevel(long level) {
        Level = level;
    }
}