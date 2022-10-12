public abstract class ComplexExpression {
   public enum operation{
      ADDITION,SUBSTRACTION,MULTIPLICATION,DIVISION
   };
   public ComplexNumber args[];
   public void execute(){
      //ceva switch cred
   };
   public abstract void executeOneOperation();
}
