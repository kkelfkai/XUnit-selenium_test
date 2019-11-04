package Cal;

public class Division {

	public Integer divid(Integer x, Integer y){

		if (y == 0 ){
			return null;
		}else if(x<y){
			return 0;
		}else if(x==y){
			return 1;
		}
		else {
			return x / y;
		}
	}
}
