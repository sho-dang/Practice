package com.example.demo;

public class ShainServiceImpl implements ShainService {

	@Override
	public String findByNo(String number) {
		// TODO 自動生成されたメソッド・スタブ
			//リポジトリから社員を選択

			ShainRepository shainRepository = new ShainRepositoryImpl();
				String name = shainRepository.selectByNo(number);

		return name;
	}

}
