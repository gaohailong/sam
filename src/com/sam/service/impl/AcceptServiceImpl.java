package com.sam.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.AcceptDao;
import com.sam.dao.InfoDao;
import com.sam.entity.AssetAccept;
import com.sam.entity.AssetInfo;
import com.sam.service.AcceptService;
import com.sam.util.CreateRandom;

@Service
public class AcceptServiceImpl implements AcceptService {

	@Autowired
	private AcceptDao acceptDao;
	@Autowired
	private InfoDao infoDao;

	@Override
	public int addAccept(String acceptStr, AssetAccept accept) throws Exception {
		CreateRandom cr = new CreateRandom();
		int aaid = cr.createRandom();
		accept.setAaid(aaid);
		accept.setAadate(new Date());
		int num = acceptDao.addAccept(accept);

		if (num > 0) {
			String[] accStr = acceptStr.split(",");
			System.out.println(accStr.length);
			for (int i = 0; i < accStr.length; i++) {
				if(accStr[i]!=null){
					AssetInfo info = new AssetInfo();
					info.setAaid(aaid);
					System.out.println(acceptStr);
					System.out.println(accStr[i]);
					String[] acc = accStr[i].split("~");
					System.out.println("length"+acc.length);
					System.out.println("ddd"+acc[0]);
					info.setAimodel(acc[0].trim());
					info.setAiname(acc[1].trim());
					info.setAtname(acc[2].trim());
					info.setAhname(acc[3].trim());
					info.setAimoney(100);
					System.out.println(acc[4]);
					info.setAsname("未使用");
					info.setAimeasuer(acc[4].trim());
					info.setAisupply(acc[5].trim());
					info.setAilife(acc[6].trim());
					info.setAidepreciation(acc[7].trim());
					info.setAiremainratio(acc[8].trim());
					info.setAiremark(acc[9].trim());
					infoDao.addInfo(info);
				}
			}
		}
		return num;
	}
}