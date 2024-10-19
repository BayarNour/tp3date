package tp2v2;

public class MaDate {
	private int jour;
	private int mois;
	private int annee;
	
	public String toString() {
		String datee =jour+"/" + mois +"/" + annee;
		return datee;
	}
	public int getJour() {
		return jour ;
	}
	public int getMois() {
		return mois ;
	}
	public int getAnnee() {
		return annee ;
	}
	
	public void setJour(int leJour) {
		jour=1;
		jour=leJour;	
	}
	public void setMois(int leMois) {
		mois=1;
		mois=leMois;
		
		
	}public void setAnnee(int lAnnee) {
		annee=lAnnee;
	}
	public MaDate(int j , int m , int a ){
		jour = j;
		mois = m;
		annee = a;
		
	}
	public MaDate(int aa) {
		annee=aa;	
		
	}
	
	public void ajouterUnJour() {
		jour++;
		switch(mois){
			case 1:if (jour > 31) {
                jour = 1;
                mois++;
                if (jour==32) {
                	System.out.println("erreur");
                }
            }break;
			case 3:if (jour > 31) {
                jour = 1;
                mois++;
            }break;
			case 7:if (jour > 31) {
                jour = 1;
                mois++;
            }break;
			case 8:if (jour > 31) {
                jour = 1;
                mois++;
            }break;
			case 10:
				if (jour>31) {
	                jour=1;
	                mois++;
	            }
				break;
				case 4:if (jour>30) {
	                jour = 1;
	                mois++;
	                
	            }
	            break;
				case 6:if (jour>30) {
	                jour = 1;
	                mois++;
	            }
	            break;
				case 9:if (jour>30) {
	                jour = 1;
	                mois++;
	            }
	            break;
				case 11:
	        	if (jour > 30) {
	                jour = 1;
	                mois++;
	            }
	            break;
	            case 2:
		    	 if ((annee%4==0&& annee%100!= 0)||(annee%400==0)){
		    		 if (jour>29) {
		    			 jour=1;
		                 mois++;
		             }
		            } else {
		                if(jour>28) {
		                    jour=1;
		                    mois++;
		                }
		            }
		            break;
		        case 12: 
		        	if (jour>31) {
		                jour=1;
		                mois=1;
		                annee++;
		            }
		            break;

		    		      
		}}
	public void ajouterPlusieursJours(int n){
		for(int i=0;i<n;i++){
			ajouterUnJour();
		}}
	public void ajouterUnMoi(){
		mois = mois+1;
		if(mois ==12) {
			mois=1;
			annee=annee+1;
		}
	}
	public void ajouterUnAn() {
		annee=++;
	}
}


	
	


