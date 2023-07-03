import java.util.Scanner;

public class MiniPJ {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        int currentMoney = 10000;
        int fatigue = 0;

        while(true) {
        	
        System.out.println("잔액 : " + currentMoney);
        System.out.println("=================작업을 선택하세요.====================");
        System.out.println("1. 아르바이트 하기");
        System.out.println("2. 쇼핑하기");
        System.out.println("3. 게임하기");
        System.out.println("4. 휴식");
        System.out.println("5. 잔액조회");
        System.out.println("6. 피로도조회");
        System.out.println("====================================================");


        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("1. 편의점 아르바이트 하기(8500원 피로도20) ");
                System.out.println("2. 서빙 아르바이트 하기(10000원 피로도30)");
                System.out.println("3. 노가다 뛰기(18000원 피로도60)");
                System.out.println("4. 종료하기");

                	
                int work = scanner.nextInt();

                switch (work) {
                    case 1:
                        int storemoney = 8500;
                        int storefatigue = 20;
                        System.out.println("=========알바를 시작합니다.....=========");
                        System.out.println("=============알바중.....==============");
                        System.out.println("============알바가 끝났습니다....===========");
                        int totalMoney = currentMoney + storemoney;
                        int totalfatigue = fatigue + storefatigue;
                        System.out.println("잔액 : " + totalMoney);
                        System.out.println("피로도 : " + totalfatigue);
                        break;

                    case 2:
                        int servMoney = 10000;
                        int servfatigue = 30;
                        System.out.println("=========알바를 시작합니다.....=========");
                        System.out.println("=============알바중.....==============");
                        System.out.println("============알바가 끝났습니다....===========");
                        totalMoney = currentMoney + servMoney;
                        totalfatigue = fatigue + servfatigue;
                        System.out.println("잔액 : " + totalMoney);
                        System.out.println("피로도 : " + totalfatigue);
                        break;
                        
                    case 3:
                    	int workMoney = 18000;
                    	int workfatigue = 60;
                    	System.out.println("=========알바를 시작합니다.....=========");
                        System.out.println("=============알바중.....==============");
                        System.out.println("============알바가 끝났습니다....===========");
                        totalMoney = currentMoney + workMoney;
                        totalfatigue = fatigue + workfatigue;
                        System.out.println("잔액 : " + totalMoney);
                        System.out.println("피로도 : " + totalfatigue);
                        break;

                    case 4:
                    	System.out.println("종료하기");
                    	break;
                }
                int shop = scanner.nextInt();
                switch(shop) {
                	case 1:
                		int buy1Money = 10000;
                		int buy1fatigue = -20;
                		System.out.println("========== 옷 주문중 ... =========");
                		System.out.println("========== 배송중 ... =========");
                		System.out.println("======== 배송이 완료되었습니다. =======");
                		int totalMoney = currentMoney + buy1Money;
                		int totalfatigue = fatigue + buy1fatigue;
                		System.out.println("잔액 : " + totalMoney);
                		System.out.println("피로도 : " + totalfatigue);
                		break;
                
                	case 2:
                		int buy2Money = 15000;
                		int buy2fatigue = -40;
                		System.out.println("========== 옷 주문중 ... =========");
                		System.out.println("========== 배송중 ... =========");
                		System.out.println("======== 배송이 완료되었습니다. =======");
                		totalMoney = currentMoney + buy2Money;
                		totalfatigue = fatigue + buy2fatigue;
                		System.out.println("잔액 : " + totalMoney);
                		System.out.println("피로도 : " + totalfatigue);
                		break;
                		
                	case 3:
                    	System.out.println("종료하기");
                    	break;
                }
            	
                }
        }
        }
        }
