package com.pdp.controller;

import com.pdp.service.Operations;

public class TeamController {

	public static void getAllPlayersOfSambhajinagar() {
		Operations.chhSambhajinagarPlayer();

	}

	public static void getAllPlayersOfMi() {

		Operations.miPlayer();
	}

	public static void getAllPlayersOfCsk() {

		Operations.cskPlayer();
	}

	public static void getAllPlayersOfRcb() {
		Operations.rcbPlayer();
	}
}