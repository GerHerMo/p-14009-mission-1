import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" == 명언 앱 == ");

        String order;
        String Rq;
        String[] WiseSaying = new String[100];
        String[] author = new String[100];
        int lastId = 0;

        while(true){
            System.out.print("명령) ");
            String str = scanner.nextLine().trim();

            if(str.contains("?")) {
                order = str.split("\\?")[0].trim(); // 명령어 추출
                Rq = str.split("\\?")[1].trim(); // 명령어에서 물음표 제거
            }
            else {
                order = str.trim();
                Rq="";// 명령어 추출
            }
            // 명령어에서 물음표 제거

            switch(order) {
                case "등록":
                    System.out.print("명언 : ");
                    WiseSaying[lastId] = scanner.nextLine();
                    System.out.print("작가 : ");
                    author[lastId] = scanner.nextLine();
                    System.out.printf("%d번 명언이 등록되었습니다.\n",++lastId);
                    break;

                case "목록":
                    System.out.println("--------------------");
                    for(int i = lastId-1; i >= 0; i--) {
                        if(WiseSaying[i] == null) {
                            continue; // 명언이 없는 경우는 건너뛴다.
                        }
                        System.out.printf("%d / %s / %s\n", i+1, WiseSaying[i], author[i]);
                    }
                    break;

                case "삭제":
                    if(Rq.equals("id=1")) {
                        if(WiseSaying[0] == null) {
                            System.out.println("1번 명언은 존재하지 않습니다.");
                            break;
                        }
                        System.out.println("1번 명언이 삭제되었습니다.");
                        WiseSaying[0] = null;
                        author[0] = null;
                    }
                    if(Rq.equals("id=2")) {
                        if(WiseSaying[1] == null) {
                            System.out.println("2번 명언은 존재하지 않습니다.");
                            break;
                        }
                        System.out.println("2번 명언이 삭제되었습니다.");
                        WiseSaying[1] = null;
                        author[1] = null;
                    }
                    break;
                case "수정":
                    if(Rq.equals("id=1")) {
                        if(WiseSaying[0] == null) {
                            System.out.println("1번 명언은 존재하지 않습니다.");
                            break;
                        }
                        System.out.print("명언 : ");
                        WiseSaying[0] = scanner.nextLine();
                        System.out.print("작가 : ");
                        author[0] = scanner.nextLine();
                        System.out.println("1번 명언이 수정되었습니다.");
                    }

                    if(Rq.equals("id=2")) {
                        if(WiseSaying[1] == null) {
                            System.out.println("2번 명언은 존재하지 않습니다.");
                            break;
                        }
                        System.out.print("명언 : ");
                        WiseSaying[1] = scanner.nextLine();
                        System.out.print("작가 : ");
                        author[1] = scanner.nextLine();
                        System.out.println("2번 명언이 수정되었습니다.");
                    }
                    if (Rq.equals("id=3")) {
                        if(WiseSaying[2] == null) {
                            System.out.println("3번 명언은 존재하지 않습니다.");
                            break;
                        }
                        System.out.print("명언 : ");
                        WiseSaying[2] = scanner.nextLine();
                        System.out.print("작가 : ");
                        author[2] = scanner.nextLine();
                        System.out.println("3번 명언이 수정되었습니다.");
                    }
                    break;


                case "종료":
                    scanner.close();
                    return;



            }

        }
    } // main
} // Main
