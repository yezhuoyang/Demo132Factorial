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
 * f0 -> Block()
 *       | AssignmentStatement()
 *       | ArrayAssignmentStatement()
 *       | IfStatement()
 *       | WhileStatement()
 *       | PrintStatement()
 */
public class Statement implements Node {
   public NodeChoice f0;

   public Statement(NodeChoice n0) {
      f0 = n0;
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

