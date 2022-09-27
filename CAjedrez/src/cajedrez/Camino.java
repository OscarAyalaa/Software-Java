/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajedrez;

/**
 *
 * @author Oscar
 */
public class Camino {
private int NumSol;
    private int TamTab;
	private int[][] visit;
	private int[] xMov = { 2, 1, -1, -2, -2, -1, 1, 2 };
	private int[] yMov = { 1, 2, 2, 1, -1, -2, -2, -1 };

	public Camino(int TabAj) {
		this.TamTab = TabAj;
		this.visit = new int[TamTab][TamTab];
		this.IniTab();
	}
	
	private void IniTab() {
		for (int i = 0; i < TamTab; i++)
			for (int j = 0; j < TamTab; j++)
				this.visit[i][j] = Integer.MIN_VALUE;
	}

	public void ResolverC() {
		visit[0][0] = 0;
		
		if( Resolvprob(1, 0, 0) == false) {
			System.out.println("No hay posible solucion...");
		}
	}

	public boolean Resolvprob(int Cmov, int x, int y) {
		
		if (Cmov == TamTab * TamTab) {
			ImpSol();
			return true;
		}
		
		boolean res = false;
		for (int i = 0; i < xMov.length; ++i) {

			int nextX = x + xMov[i];
			int nextY = y + yMov[i];

			if ( MovVal(nextX, nextY) && visit[nextX][nextY] == Integer.MIN_VALUE ) {

				visit[nextX][nextY] = Cmov;
				res = Resolvprob(Cmov + 1, nextX, nextY) || res;
				
				visit[nextX][nextY] = Integer.MIN_VALUE; 
			}
		}
		return res;
	}

	public boolean MovVal(int x, int y) {
		if (x < 0 || x >= TamTab || y < 0 || y >= TamTab) {
			return false;
		} else {
			return true;	
		}
	}

	public void ImpSol() {
		System.out.println("======================================================");
		System.out.println("Solucion " + (++NumSol));
		for (int i = 0; i < TamTab; i++) {
			for (int j = 0; j < TamTab; j++) {
				System.out.print(visit[i][j] + " ");
			}

			System.out.println();
		}
		System.out.println("\n");
	}
}
