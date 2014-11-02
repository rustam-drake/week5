
public class Q3_paperSize {
	public static void main(String arg[]){

		paperSize("A000");
		paperSize("a1");
		paperSize("A2");
		paperSize("hi");
	}
	
	static void paperSize(String paper){
		Dim dim=new Dim();
		String temp="";
		if(paper.charAt(0)=='a'||paper.charAt(0)=='A'){
			temp=paper.substring(1);
		}else temp=paper;
		
		if(temp.charAt(0)=='0'){
			int count=0;
			for(int i=0;i<temp.length();i++){
				count++;
			}
			for(int i=0;i<count-1;i++){
				int tempshort=dim.shortSide;
				dim.setShortSide(dim.longSide);	
				dim.setLongSide(tempshort*2);					
			}
			System.out.println("Dimensions of "+paper+" are "+dim.shortSide+"x"+dim.longSide);
		}else if(temp.charAt(0)>='0'&&temp.charAt(0)<='9'){
			int n=Integer.parseInt(temp);
			for(int i=0;i<n;i++){
				int tempshort=dim.shortSide;
				dim.setShortSide(dim.longSide/2);	
				dim.setLongSide(tempshort);
			}System.out.println("Dimensions of "+paper+" are "+dim.shortSide+"x"+dim.longSide);
		}else System.out.print("Error: invalid input");
		
		
	}
}


class Dim{
	int longSide=1189;
	int shortSide=841;
	
	void setLongSide(int i){
		longSide=i;

	}
	void setShortSide(int i){
		shortSide=i;
	}
	
	int getLongSide(){
		return longSide;
	}
	int getShortSide(){
		return shortSide;
	}
}