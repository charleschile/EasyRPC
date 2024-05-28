package com.charleschile.easyrpc.demo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EasyrpcDemoProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyrpcDemoProviderApplication.class, args);
	}

	// HTTP + JSON的方式来提供通信
	// 请求是RpcRquest
	// 响应参数RpcResponse

}
