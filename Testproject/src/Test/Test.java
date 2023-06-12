package Test;



		//사는사람
		class Shopper{
		   private int Holding;
		   private int OrangeCnt;
		   
		   public Shopper(int Holding, int OrangeCnt) {
		      
		      this.Holding = Holding;
		      this.OrangeCnt = OrangeCnt;
		   }
		   public void Payment(digger digger, int money)
		   {
		      Holding -= money;
		      int cnt = digger.recipient(money);
		      OrangeCnt += cnt;
		   }
		   public void ShowInfo(){
		      System.out.println("-----구매자정보-----");
		      System.out.println("보유금액 : "+ Holding);
		      System.out.println("오렌지개수 : "+ OrangeCnt);
		   }
		   
		}
		//파는사람
		class digger{
		   private int Holding;
		   private int OrangeCnt;
		   public int Price;
		   
		   public digger(int Holding, int OrangeCnt, int price) {
		      super();
		      this.Holding = Holding;
		      this.OrangeCnt = OrangeCnt;
		      Price = price;
		   }
		   public int recipient (int money) {
		      
		      Holding +=money;
		      int revcnt = money/Price;
		      OrangeCnt -= revcnt;
		      return revcnt;
		   }
		   public void ShowInfo() {
		      System.out.println("-----판매자정보-----");
		      System.out.println("보유금액 : "+ Holding);
		      System.out.println("오렌지개수 : "+ OrangeCnt);
		      System.out.println("개당가격 : "+ Price);
		   }
		}

		public class Test {
		   public static void main(String[] args) {
		   
		 
		      digger 오렌지장수1= new digger(100000000,100,1000);
		       Shopper 서강준 = new Shopper(10000,0); 
		       Shopper 박효신 = new Shopper(20000,0);
		       Shopper 최정훈 = new Shopper(30000,0);
		       서강준.Payment(오렌지장수1,2000);
		       박효신.Payment(오렌지장수1,5000);
		       최정훈.Payment(오렌지장수1,3000);
		       
		       오렌지장수1.ShowInfo();
		       서강준.ShowInfo();
		       박효신.ShowInfo();
		       최정훈.ShowInfo();
		    
		  }
		

	}


