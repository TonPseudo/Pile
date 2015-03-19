public class PileEntiersPositifsOuNuls 
{
	private int[] element;
	private int TAILLE_MAX;
	private int taille;

	public PileEntiersPositifsOuNuls(int taille) 
	{
		this.element = new int [taille];
		this.taille = 0;
		this.TAILLE_MAX = taille;
	}
	
	public void empiler(int entier)
	{
		element[taille] = entier;
		taille = taille++;
	}
	
	public void desempiler()
	{
		element[taille] = 0;
		taille = taille-1;
	}
}