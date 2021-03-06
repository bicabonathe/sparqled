/* Generated By:JJTree: Do not edit this line. ASTPropertyListPath.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.openrdf.sindice.query.parser.sparql.ast;

public
class ASTPropertyListPath extends SimpleNode {
  public ASTPropertyListPath(int id) {
    super(id);
  }

  public ASTPropertyListPath(SyntaxTreeBuilder p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(SyntaxTreeBuilderVisitor visitor, Object data) throws VisitorException {
    return visitor.visit(this, data);
  }
  
	public Node getVerb() {
		return children.get(0);
	}

	public ASTObjectList getObjectList() {
		return (ASTObjectList)children.get(1);
	}

	public ASTPropertyListPath getNextPropertyList() {
		if (children.size() >= 3) {
			return (ASTPropertyListPath)children.get(2);
		}
		return null;
	}
}
/* JavaCC - OriginalChecksum=49d7e4f53b5a9acc771b482fb136e8db (do not edit this line) */
