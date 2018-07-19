
public class Ponto {
	private int coordenadaX;
	private int coordenadaY;
	
	public Ponto() {
		this.setCoordenadaX(0);
		this.setCoordenadaY(0);
	}//-----------------------

	public int getCoordenadaX() {
		return this.coordenadaX;
	}//-----------------------
	
	public int getCoordenadaY() {
		return this.coordenadaY;
	}//-----------------------
	
	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}//-----------------------
	
	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}//-----------------------
	
	public void incrementaXY(int x, int y) {
		this.coordenadaX += x;
		this.coordenadaY += y;
	}//-----------------------
	
	public void decrementaXY(int x, int y) {
		this.coordenadaX -= x;
		this.coordenadaY -= y;
	}//-----------------------
	
	public void mostraPonto() {
		System.out.println("\n=== Ponto ===");
		System.out.println(" Coord. X: "+this.coordenadaX);
		System.out.println(" Coord. Y: "+this.coordenadaY);
	}//-----------------------
	
}// fim da classe
