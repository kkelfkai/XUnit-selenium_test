package Cal;

public class Addition {

	public Integer add(Integer a, Integer b){

		if (a == 0){
			return 0;
		}else if(b == 0){
			return 0;
		}else if (a < 0 || b < 0){
			return null;
		}else if(b<0){
			return null;
		}else {
			return a+b;
		}
	}
}
