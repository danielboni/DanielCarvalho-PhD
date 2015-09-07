package antlr;

/* ANTLR Translator Generator
 * Project led by Terence Parr at http://www.jGuru.com
 * Software rights: http://www.antlr.org/license.html
 *
 * $Id: ActionElement.java,v 1.1 2005/03/20 09:16:48 irmscher Exp $
 */

class ActionElement extends AlternativeElement {
    protected String actionText;
    protected boolean isSemPred = false;


    public ActionElement(Grammar g, Token t) {
        super(g);
        actionText = t.getText();
        line = t.getLine();
        column = t.getColumn();
    }

    public void generate() {
        grammar.generator.gen(this);
    }

    public Lookahead look(int k) {
        return grammar.theLLkAnalyzer.look(k, this);
    }

    public String toString() {
        return " " + actionText + (isSemPred?"?":"");
    }
}