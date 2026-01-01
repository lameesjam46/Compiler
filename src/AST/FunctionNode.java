package AST;
import java.util.ArrayList;
import java.util.List;

public class FunctionNode extends ASTNode {
    private String name;
    private List<String> bodyLines = new ArrayList<>();

    public FunctionNode(String name, int line) {
        // نمرر الاسم الحقيقي (مثل search) للأب بدلاً من النص الثابت "Function"
        super(name, line);
        this.name = name;
    }



    public String getName() { return name; }
    // ... باقي الكود كما هو
    @Override
    public String getNodeName() {
        return "Function: "+name ;
    }
}