
package com.Raisetech.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
@SpringBootApplication
@RestController
public class HelloController {
	public static void main(String[] args) {
		SpringApplication.run(HelloController.class, args);
	}

	//時間の表示
	@GetMapping("time")
	public String time() {
		LocalDateTime date1 = LocalDateTime.now();// 2021-10-06T23:47:22.175049200
		// 表示形式を指定
		DateTimeFormatter dtformat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");
		String fdate1 = dtformat.format(date1); //表示形式+Stringに変換 2021/10/06 23:47:22.175
		return fdate1;
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "AKI") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/japan")
	public Object japan() {
		String responseJapan = "こんにちは!";
		return responseJapan;
	}

	@GetMapping("/china")
	public Object china() {
		String responseChina = "nǐ hǎo(ニーハオ)!";
		return responseChina;
	}

	@GetMapping("/us")
	public Object us() {
		String responseUs = "Hello!";
		return responseUs;
	}

	@GetMapping("/ireland")
	public  Object ireland(){
		String responseIreland = "Dia dhuit（ディア グイト）!";
		return responseIreland;
	}
}
