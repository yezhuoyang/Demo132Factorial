//
// Generated by JTB 1.3.2
//

package minijava.syntaxtree;

import minijava.visitor.GJNoArguVisitor;
import minijava.visitor.GJVisitor;
import minijava.visitor.GJVoidVisitor;
import minijava.visitor.Visitor;

/**
 * Grammar production:
 * f0 -> "new"
 * f1 -> Identifier()
 * f2 -> "("
 * f3 -> ")"
 */
public class AllocationExpression implements Node {
   public NodeToken f0;
   public Identifier f1;
   public NodeToken f2;
   public NodeToken f3;

   public AllocationExpression(NodeToken n0, Identifier n1, NodeToken n2, NodeToken n3) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
   }

   public AllocationExpression(Identifier n0) {
      f0 = new NodeToken("new");
      f1 = n0;
      f2 = new NodeToken("(");
      f3 = new NodeToken(")");
   }

   public void accept(Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}

