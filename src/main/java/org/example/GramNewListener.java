package org.example;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramNewParser}.
 */
public interface GramNewListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramNewParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(GramNewParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramNewParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(GramNewParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramNewParser#assignbool}.
	 * @param ctx the parse tree
	 */
	void enterAssignbool(GramNewParser.AssignboolContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramNewParser#assignbool}.
	 * @param ctx the parse tree
	 */
	void exitAssignbool(GramNewParser.AssignboolContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramNewParser#assignsstr}.
	 * @param ctx the parse tree
	 */
	void enterAssignsstr(GramNewParser.AssignsstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramNewParser#assignsstr}.
	 * @param ctx the parse tree
	 */
	void exitAssignsstr(GramNewParser.AssignsstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramNewParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(GramNewParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramNewParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(GramNewParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramNewParser#numVar}.
	 * @param ctx the parse tree
	 */
	void enterNumVar(GramNewParser.NumVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramNewParser#numVar}.
	 * @param ctx the parse tree
	 */
	void exitNumVar(GramNewParser.NumVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramNewParser#assignsdigit}.
	 * @param ctx the parse tree
	 */
	void enterAssignsdigit(GramNewParser.AssignsdigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramNewParser#assignsdigit}.
	 * @param ctx the parse tree
	 */
	void exitAssignsdigit(GramNewParser.AssignsdigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramNewParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(GramNewParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramNewParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(GramNewParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramNewParser#assignlist}.
	 * @param ctx the parse tree
	 */
	void enterAssignlist(GramNewParser.AssignlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramNewParser#assignlist}.
	 * @param ctx the parse tree
	 */
	void exitAssignlist(GramNewParser.AssignlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramNewParser#var_1}.
	 * @param ctx the parse tree
	 */
	void enterVar_1(GramNewParser.Var_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramNewParser#var_1}.
	 * @param ctx the parse tree
	 */
	void exitVar_1(GramNewParser.Var_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramNewParser#var_2}.
	 * @param ctx the parse tree
	 */
	void enterVar_2(GramNewParser.Var_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramNewParser#var_2}.
	 * @param ctx the parse tree
	 */
	void exitVar_2(GramNewParser.Var_2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramNewParser#operations}.
	 * @param ctx the parse tree
	 */
	void enterOperations(GramNewParser.OperationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramNewParser#operations}.
	 * @param ctx the parse tree
	 */
	void exitOperations(GramNewParser.OperationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramNewParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(GramNewParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramNewParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(GramNewParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramNewParser#print_var}.
	 * @param ctx the parse tree
	 */
	void enterPrint_var(GramNewParser.Print_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramNewParser#print_var}.
	 * @param ctx the parse tree
	 */
	void exitPrint_var(GramNewParser.Print_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramNewParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(GramNewParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramNewParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(GramNewParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramNewParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(GramNewParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramNewParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(GramNewParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramNewParser#cycle}.
	 * @param ctx the parse tree
	 */
	void enterCycle(GramNewParser.CycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramNewParser#cycle}.
	 * @param ctx the parse tree
	 */
	void exitCycle(GramNewParser.CycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramNewParser#else_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_block(GramNewParser.Else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramNewParser#else_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_block(GramNewParser.Else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramNewParser#conditional_operator}.
	 * @param ctx the parse tree
	 */
	void enterConditional_operator(GramNewParser.Conditional_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramNewParser#conditional_operator}.
	 * @param ctx the parse tree
	 */
	void exitConditional_operator(GramNewParser.Conditional_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramNewParser#cond_1}.
	 * @param ctx the parse tree
	 */
	void enterCond_1(GramNewParser.Cond_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramNewParser#cond_1}.
	 * @param ctx the parse tree
	 */
	void exitCond_1(GramNewParser.Cond_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramNewParser#cond_2}.
	 * @param ctx the parse tree
	 */
	void enterCond_2(GramNewParser.Cond_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramNewParser#cond_2}.
	 * @param ctx the parse tree
	 */
	void exitCond_2(GramNewParser.Cond_2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramNewParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(GramNewParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramNewParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(GramNewParser.ConditionContext ctx);
}