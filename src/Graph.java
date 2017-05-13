import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph {
	public int[][] Matrix;
	public int size;
	public void Add(){
		System.out.println("Enter the number of nodes: ");
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		Matrix=new int[size][size];
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				Matrix[i][j]=0;
			}
		}
		Matrix[0][1]=1;
		Matrix[1][2]=1;
		Matrix[2][3]=1;
		Matrix[2][4]=1;
		Matrix[3][4]=1;
		
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				System.out.print("  " + Matrix[i][j]);
			}
			System.out.println("\n");
		}
	}
	
	public boolean FindPath(int start,int destination){
		if(destination>size-1){
			return false;
		}
		
		ArrayList<Integer> visited=new ArrayList<Integer>();
		Queue<Integer> queue=new LinkedList<Integer>();
		
		int num;
		int node=start;
		
		
		queue.add(node);
		while(true){
			
			num=queue.poll();
			visited.add(num);
			if(visited.contains(destination)){
				return true;
			}
			
			for(int j=0;j<size;j++){
				if(Matrix[num][j]==1){
					queue.add(j);
				}
			}
		}
	}
	
}
