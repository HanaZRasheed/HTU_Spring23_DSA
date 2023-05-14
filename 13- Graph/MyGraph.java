package graph;

public class MyGraph {
	
	public static void main(String[] args) {
		int [][] graph= {{0,1,1,0},{1,0,1,0},{1,1,0,1},{0,0,1,0}};
//		int [][] graph2=new int[4][4];
//		graph2[0][0]=0;
//		graph2[0][1]=1;
//		graph2[0][2]=1;
//		graph2[0][3]=0;
//		
//		graph2[1][0]=1;
//		graph2[1][1]=0;
//		graph2[1][2]=1;
//		graph2[1][3]=0;
//		
//		graph2[2][0]=1;
//		graph2[2][1]=1;
//		graph2[2][2]=0;
//		graph2[2][3]=1;
//		
//		graph2[3][0]=0;
//		graph2[3][1]=0;
//		graph2[3][2]=1;
//		graph2[3][3]=0;
		for(int i=0;i<graph.length;i++) {
			for(int j=0; j<graph[i].length;j++) {
				System.out.print(graph[i][j]+ " ");
			}
			System.out.println();
		}
	
	System.out.println("***************");

	findAdjacentNodes(graph, 2);
	checkAdjacency(graph,2,2);

}
	
	public static void findAdjacentNodes(int [][] g, int j) {
		for(int i=0;i<g[j].length;i++) {
			if(g[j][i]==1) {
				System.out.println(j +" is adjacent with "+ i);
			}
		}
		System.out.println();	
	}
	
	public static void checkAdjacency(int [][]g, int v1, int v2) {
		if(g[v1][v2]==1) {
			System.out.println(v1 +" is adjacent with "+ v2);
		}
		else {
			System.out.println(v1 +" is not adjacent with "+ v2);
		}
	}

}
