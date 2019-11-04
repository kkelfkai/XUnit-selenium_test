package Mock;

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

	public Integer divid2(Integer x, Integer y, Integer z){
		return divid(x,y)/z;
	}
}
