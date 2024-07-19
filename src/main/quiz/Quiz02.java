package main.quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("1: mysql");
		System.out.println("2: oracle");
		System.out.println("3: postgres");

		int num = scanner.nextInt();

		DBDriver dbDriver = null;

		switch (num) {
		case 1:
			dbDriver = new MySplDriver();
			break;
		case 2:
			dbDriver = new OracleDBDriver();
			break;
		case 3:
			dbDriver = new PostgresDBDriver();
			break;
		default:
			System.out.println("잘못된 값입니다.");
		}

		if (dbDriver != null) {
			dbDriver.dbConnect();
		} else {
			System.out.println("dbDriver 변수값=null");
		}
	}

}

// MySpl 드라이버 클래스
class MySplDriver implements DBDriver {

	@Override
	public void dbConnect() {
		System.out.println("MySplDB 연결");
	}

}

// 오라클 DB 드라이버
class OracleDBDriver implements DBDriver {

	@Override
	public void dbConnect() {
		System.out.println("OracleDB 연결");
	}

}

// Postgres DB 드라이버
class PostgresDBDriver implements DBDriver {

	@Override
	public void dbConnect() {
		System.out.println("PostgresDB 연결");
	}

}