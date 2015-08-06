/*O empreendedor verifica todos os problemas que tem que resolver, 
adicionar em sua lista mental ou marca em algum lugar, mas quando 
começa a resolver com boa energia, sabe que resolver esta lista de 
problemas é como o um algoritmo que possui um loop com uma condição 
para uma operação. Funciona assim:*/

List<Problem> problemList = Problems.getCurrentProblems();
int size = problemList.size();
for (int i = 0; i < size; i++)
{
	Problem problem = problemList.get(i);
    	List<Method> methodList = SolutionMethod.getAllMethodPossibilities(problem);
	List<Solution> solutionList = new ArrayList<>();	

    	for (int j = 0; j < methodList.size(); j++)
    	{
		Method method = methodList.get(j);
		boolean result = method.verify();// Deve aplicar efetivamento em outro loop.
		if ( result == true )
			solutionList.add(method);
    	
    	}
    	
    	problem.applyBetterSolution(solutionList);
}
