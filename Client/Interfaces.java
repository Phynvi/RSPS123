public class Interfaces extends RSInterface {

	public static void loadInterfaces(StreamLoader streamLoader,
			TextDrawingArea textDrawingAreas[]) {
		Sidebar0(textDrawingAreas);
		slayerInterface(textDrawingAreas);
		slayerInterfaceSub1(textDrawingAreas);
		slayerInterfaceSub2(textDrawingAreas);
		equipmentScreen(textDrawingAreas);
		prayerTab(textDrawingAreas);
		clanChatTab(textDrawingAreas);
		clanChatSetup(textDrawingAreas);
		magicTab(textDrawingAreas);
		ancientMagicTab(textDrawingAreas);
		optionTab(textDrawingAreas);
		emoteTab();
		godWars(textDrawingAreas);
		Logout(textDrawingAreas);
		slayerRewardsBuy(textDrawingAreas);
		slayerRewardsLearn(textDrawingAreas);
		slayerRewardsAssign(textDrawingAreas);
		equipmentTab(textDrawingAreas);
		itemsOnDeathDATA(textDrawingAreas);
		itemsOnDeath(textDrawingAreas);
		Pestpanel(textDrawingAreas);
		Pestpanel2(textDrawingAreas);
		configureLunar(textDrawingAreas);
		constructLunar();
	}

	public static void optionTab(TextDrawingArea[] tda) {
		RSInterface tab = addTabInterface(904);
		RSInterface energy = interfaceCache[149];
		energy.textColor = 0xff9933;
		addSprite(905, 9, "/Options/SPRITE");
		addSprite(907, 18, "/Options/SPRITE");
		addSprite(909, 29, "/Options/SPRITE");
		addSprite(951, 32, "/Options/SPRITE");
		addSprite(953, 33, "/Options/SPRITE");
		addSprite(955, 34, "/Options/SPRITE");
		addSprite(947, 36, "/Options/SPRITE");
		addSprite(949, 35, "/Options/SPRITE");
		addSprite(949, 35, "/Options/SPRITE");
		// run button here
		addConfigButton(152, 904, 30, 31, "/Options/SPRITE", 40, 40,
				"Toggle-run", 1, 5, 173);
		addConfigButton(906, 904, 10, 14, "/Options/SPRITE", 32, 16, "Dark", 1,
				5, 166);
		addConfigButton(908, 904, 11, 15, "/Options/SPRITE", 32, 16, "Normal",
				2, 5, 166);
		addConfigButton(910, 904, 12, 16, "/Options/SPRITE", 32, 16, "Bright",
				3, 5, 166);
		addConfigButton(912, 904, 13, 17, "/Options/SPRITE", 32, 16,
				"Very Bright", 4, 5, 166);
		addConfigButton(930, 904, 19, 24, "/Options/SPRITE", 26, 16,
				"Music Off", 4, 5, 168);
		addConfigButton(931, 904, 20, 25, "/Options/SPRITE", 26, 16,
				"Music Level-1", 3, 5, 168);
		addConfigButton(932, 904, 21, 26, "/Options/SPRITE", 26, 16,
				"Music Level-2", 2, 5, 168);
		addConfigButton(933, 904, 22, 27, "/Options/SPRITE", 26, 16,
				"Music Level-3", 1, 5, 168);
		addConfigButton(934, 904, 23, 28, "/Options/SPRITE", 24, 16,
				"Music Level-4", 0, 5, 168);
		addConfigButton(941, 904, 19, 24, "/Options/SPRITE", 26, 16,
				"Sound Effects Off", 4, 5, 169);
		addConfigButton(942, 904, 20, 25, "/Options/SPRITE", 26, 16,
				"Sound Effects Level-1", 3, 5, 169);
		addConfigButton(943, 904, 21, 26, "/Options/SPRITE", 26, 16,
				"Sound Effects Level-2", 2, 5, 169);
		addConfigButton(944, 904, 22, 27, "/Options/SPRITE", 26, 16,
				"Sound Effects Level-3", 1, 5, 169);
		addConfigButton(945, 904, 23, 28, "/Options/SPRITE", 24, 16,
				"Sound Effects Level-4", 0, 5, 169);
		addConfigButton(913, 904, 30, 31, "/Options/SPRITE", 40, 40,
				"Toggle-Orbs", 0, 5, 170);
		addConfigButton(915, 904, 30, 31, "/Options/SPRITE", 40, 40,
				"Toggle-Chat Effects", 0, 5, 171);
		addConfigButton(957, 904, 30, 31, "/Options/SPRITE", 40, 40,
				"Toggle-Split Private Chat", 1, 5, 287);
		addConfigButton(12464, 904, 30, 31, "/Options/SPRITE", 40, 40,
				"Toggle-Accept Aid", 0, 5, 427);
		addButton(17255, 0, "/Options/OTHER", "");
		tab.totalChildren(29);
		int x = 0;
		int y = 2;
		tab.child(0, 905, 13 + x, 10 + y);
		tab.child(1, 906, 48 + x, 18 + y);
		tab.child(2, 908, 80 + x, 18 + y);
		tab.child(3, 910, 112 + x, 18 + y);
		tab.child(4, 912, 144 + x, 18 + y);
		tab.child(5, 907, 14 + x, 55 + y);
		tab.child(6, 930, 49 + x, 61 + y);
		tab.child(7, 931, 75 + x, 61 + y);
		tab.child(8, 932, 101 + x, 61 + y);
		tab.child(9, 933, 127 + x, 61 + y);
		tab.child(10, 934, 151 + x, 61 + y);
		tab.child(11, 909, 13 + x, 99 + y);
		tab.child(12, 941, 49 + x, 104 + y);
		tab.child(13, 942, 75 + x, 104 + y);
		tab.child(14, 943, 101 + x, 104 + y);
		tab.child(15, 944, 127 + x, 104 + y);
		tab.child(16, 945, 151 + x, 104 + y);
		tab.child(17, 913, 15, 153);
		tab.child(18, 955, 19, 159);
		tab.child(19, 915, 75, 153);
		tab.child(20, 953, 79, 160);
		tab.child(21, 957, 135, 153);
		tab.child(22, 951, 139, 159);
		tab.child(23, 12464, 15, 208);
		tab.child(24, 949, 20, 213);
		tab.child(25, 152, 75, 208);
		tab.child(26, 947, 87, 212);
		tab.child(27, 149, 80, 231);
		tab.child(28, 17255, 135, 208);
	}

	public static void slayerInterface(TextDrawingArea[] tda) {
		RSInterface rsInterface = addInterface(20000);
		addSprite(20001, 1, "Slayer/IMAGE");
		addHoverButton(20002, "Slayer/IMAGE", 4, 16, 16, "Close window", 0,
				20003, 1);
		addHoveredButton(20003, "Slayer/IMAGE", 5, 16, 16, 20004);
		addHoverButton(20005, "", 0, 85, 20, "Buy", 0, 20006, 1);
		addHoverButton(20007, "", 0, 85, 20, "Learn", 0, 20008, 1);
		addHoverButton(20009, "", 0, 85, 20, "Assignment", 0, 20010, 1);
		addText(20011, "Slayer Points: ", tda, 3, 0xFF981F);
		addTextButton(20012, "Slayer Experience 50", "Buy Slayer Experience",
				0xFF981F, false, true, tda, 1, 400);
		addTextButton(20013, "Slayer's Respite 25", "Buy Slayer's Respite",
				0xFF981F, false, true, tda, 1, 401);
		addTextButton(20014, "Slayer Darts 35", "Buy Slayer Darts", 0xFF981F,
				false, true, tda, 1, 402);
		addTextButton(20015, "Broad Arrows 25", "Buy Broad Arrows", 0xFF981F,
				false, true, tda, 1, 403);
		setChildren(11, rsInterface);
		rsInterface.child(0, 20001, 12, 10);
		rsInterface.child(1, 20002, 473, 20);
		rsInterface.child(2, 20003, 473, 20);
		rsInterface.child(3, 20005, 21, 23);
		rsInterface.child(4, 20007, 107, 23);
		rsInterface.child(5, 20009, 193, 23);
		rsInterface.child(6, 20011, 98, 74);
		rsInterface.child(7, 20012, 124, 128);
		rsInterface.child(8, 20013, 125, 160);
		rsInterface.child(9, 20014, 125, 190);
		rsInterface.child(10, 20015, 124, 220);

	}

	public static void slayerRewardsBuy(TextDrawingArea[] tda) {
		RSInterface rsi = addTab(25400);
		int j = 0;
		addSprite(25401, 1, "Slayer/PANEL");
		addButton(25402, 0, "Slayer/TAB", "View", 27640, 1, 75, 23);
		addButton(25403, 1, "Slayer/TAB", "View", 27640, 1, 75, 23);
		addButton(25404, 1, "Slayer/TAB", "View", 27640, 1, 75, 23);
		addText(25405, "Buy", tda, 0, 0xff9040);
		addText(25406, "Learn", tda, 0, 0xff9040);
		addText(25407, "Assignment", tda, 0, 0xff9040);
		addText(25408, "Slayer Points : ", tda, 2, 0xff9040);
		addText(25409, "XXXX", tda, 2, 0xff9040);
		addHoverText(25510, "Close window", "Close window", tda, 1, 0xff9040,
				false, true, 73);
		addHoverText(25411, "Purchase slayer experience", "Slayer experience",
				tda, 1, 0xff9040, false, true, 205);
		addText(25412, "(50 Points)", tda, 0, 0xff9040);
		addHoverText(25413, "Purchase Slayer's Respite(4)",
				"Slayer's Respite(4)", tda, 1, 0xff9040, false, true, 205);
		addText(25414, "(25 Points)", tda, 0, 0xff9040);
		addHoverText(25415, "Purchase 250 Slayer dart casts",
				"Slayer dart casts", tda, 1, 0xff9040, false, true, 205);
		addText(25416, "(35 Points)", tda, 0, 0xff9040);
		addHoverText(25417, "Nothing yet!", "Nothing here!", tda, 1, 0xff9040,
				false, true, 205);
		addText(25418, "(35 Points)", tda, 0, 0xff9040);
		rsi.totalChildren(18);
		rsi.child(j, 25401, 10, 10);
		j++;
		rsi.child(j, 25402, 20, 20);
		j++;
		rsi.child(j, 25403, 98, 20);
		j++;
		rsi.child(j, 25404, 176, 20);
		j++;
		rsi.child(j, 25405, 40, 25);
		j++;
		rsi.child(j, 25406, 118, 25);
		j++;
		rsi.child(j, 25407, 186, 25);
		j++;
		rsi.child(j, 25408, 85, 75);
		j++;
		rsi.child(j, 25409, 200, 75);
		j++;
		rsi.child(j, 25510, 409, 20);
		j++;
		rsi.child(j, 25411, 161, 153);
		j++;
		rsi.child(j, 25412, 409, 157);
		j++;
		rsi.child(j, 25413, 161, 190);
		j++;
		rsi.child(j, 25414, 409, 194);
		j++;
		rsi.child(j, 25415, 161, 233);
		j++;
		rsi.child(j, 25416, 409, 237);
		j++;
		rsi.child(j, 25417, 161, 270);
		j++;
		rsi.child(j, 25418, 409, 274);
		j++;
	}

	public static void slayerRewardsLearn(TextDrawingArea[] tda) {
		RSInterface rsi = addTab(25200);
		int j = 0;
		addSprite(25201, 2, "Slayer/PANEL");
		addButton(25202, 1, "Slayer/TAB", "View", 27640, 1, 75, 23);
		addButton(25203, 0, "Slayer/TAB", "View", 27640, 1, 75, 23);
		addButton(25204, 1, "Slayer/TAB", "View", 27640, 1, 75, 23);
		addText(25205, "Buy", tda, 0, 0xff9040);
		addText(25206, "Learn", tda, 0, 0xff9040);
		addText(25207, "Assignment", tda, 0, 0xff9040);
		addText(25208, "Slayer Points : ", tda, 2, 0xff9040);
		addText(25209, "XXXX", tda, 2, 0xff9040);
		addHoverText(25210, "Close window", "Close window", tda, 1, 0xff9040,
				false, true, 73);
		addHoverText(25211, "Unlock the ability to create a slayer helmet",
				"Unlock", tda, 1, 0xff9040, false, true, 205);
		addText(25212, "(300 Points)", tda, 0, 0xff9040);
		addHoverText(25213, "Unlock the ability to create rings of slaying",
				"Unlock", tda, 1, 0xff9040, false, true, 205);
		addText(25214, "(100 Points)", tda, 0, 0xff9040);
		rsi.totalChildren(14);
		rsi.child(j, 25201, 10, 10);
		j++;
		rsi.child(j, 25202, 20, 20);
		j++;
		rsi.child(j, 25203, 98, 20);
		j++;
		rsi.child(j, 25204, 176, 20);
		j++;
		rsi.child(j, 25205, 40, 25);
		j++;
		rsi.child(j, 25206, 118, 25);
		j++;
		rsi.child(j, 25207, 186, 25);
		j++;
		rsi.child(j, 25208, 85, 75);
		j++;
		rsi.child(j, 25209, 200, 75);
		j++;
		rsi.child(j, 25210, 409, 20);
		j++;
		rsi.child(j, 25211, 150, 165);
		j++;
		rsi.child(j, 25212, 409, 170);
		j++;
		rsi.child(j, 25213, 150, 225);
		j++;
		rsi.child(j, 25214, 409, 230);
		j++;
	}

	public static void slayerRewardsAssign(TextDrawingArea[] tda) {
		RSInterface rsi = addTab(25300);
		int j = 0;
		addSprite(25301, 3, "Slayer/PANEL");
		addButton(25602, 1, "Slayer/TAB", "View", 27640, 1, 75, 23);
		addButton(25603, 1, "Slayer/TAB", "View", 27640, 1, 75, 23);
		addButton(25604, 0, "Slayer/TAB", "View", 27640, 1, 75, 23);
		addText(25305, "Buy", tda, 0, 0xff9040);
		addText(25306, "Learn", tda, 0, 0xff9040);
		addText(25307, "Assignment", tda, 0, 0xff9040);
		addText(25308, "Slayer Points : ", tda, 2, 0xff9040);
		addText(25309, "XXXX", tda, 2, 0xff9040);
		addHoverText(25310, "Close window", "Close window", tda, 1, 0xff9040,
				false, true, 73);
		addHoverText(25311, "Cancel your current task",
				"Cancel your current task", tda, 1, 0xff9040, false, true, 140);
		addText(25312, "(30 Points)", tda, 0, 0xff9040);
		addHoverText(25313, "Cancel and stop assigning current task",
				"Cancel task and stop it from being assigned", tda, 1,
				0xff9040, false, true, 225);
		addText(25314, "(100 Points)", tda, 0, 0xff9040);
		addText(25315, "line 1", tda, 1, 0xFF981F);
		addText(25316, "line 2", tda, 1, 0xFF981F);
		addText(25317, "line 3", tda, 1, 0xFF981F);
		addText(25318, "line 4", tda, 1, 0xFF981F);
		addButton(25319, 6, "Slayer/IMAGE", "Delete removed slayer task");
		addButton(25320, 6, "Slayer/IMAGE", "Delete removed slayer task");
		addButton(25321, 6, "Slayer/IMAGE", "Delete removed slayer task");
		addButton(25322, 6, "Slayer/IMAGE", "Delete removed slayer task");
		rsi.totalChildren(22);
		rsi.child(j, 25301, 10, 10);
		j++;
		rsi.child(j, 25602, 20, 20);
		j++;
		rsi.child(j, 25603, 98, 20);
		j++;
		rsi.child(j, 25604, 176, 20);
		j++;
		rsi.child(j, 25305, 40, 25);
		j++;
		rsi.child(j, 25306, 118, 25);
		j++;
		rsi.child(j, 25307, 186, 25);
		j++;
		rsi.child(j, 25308, 85, 75);
		j++;
		rsi.child(j, 25309, 200, 75);
		j++;
		rsi.child(j, 25310, 409, 20);
		j++;
		rsi.child(j, 25311, 87, 130);
		j++;
		rsi.child(j, 25312, 409, 134);
		j++;
		rsi.child(j, 25313, 87, 150);
		j++;
		rsi.child(j, 25314, 409, 154);
		j++;
		rsi.child(j, 25315, 87, 205);
		j++;
		rsi.child(j, 25316, 87, 225);
		j++;
		rsi.child(j, 25317, 87, 245);
		j++;
		rsi.child(j, 25318, 87, 265);
		j++;
		rsi.child(j, 25319, 400, 205);
		j++;
		rsi.child(j, 25320, 400, 225);
		j++;
		rsi.child(j, 25321, 400, 245);
		j++;
		rsi.child(j, 25322, 400, 265);
		j++;
	}

	public static void clanChatSetup(TextDrawingArea[] tda) {
		RSInterface rsi = addInterface(18300);
		rsi.totalChildren(12 + 15);
		int count = 0;
		/* Background */
		addSprite(18301, 1, "/Interfaces/Clan Chat/sprite");
		rsi.child(count++, 18301, 14, 18);
		/* Close button */
		addButton(18302, 0, "/Interfaces/Clan Chat/close", "Close");
		interfaceCache[18302].atActionType = 3;
		rsi.child(count++, 18302, 475, 26);
		/* Clan Setup title */
		addText(18303, "Clan Setup", tda, 2, 0xFF981F, true, true);
		rsi.child(count++, 18303, 256, 26);
		/* Setup buttons */
		String[] titles = { "Clan name:", "Who can enter chat?",
				"Who can talk on chat?", "Who can kick on chat?",
				"Who can ban on chat?" };
		String[] defaults = { "Chat Disabled", "Anyone", "Anyone", "Anyone",
				"Anyone" };
		String[] whoCan = { "Anyone", "Recruit", "Corporal", "Sergeant",
				"Lieutenant", "Captain", "General", "Only Me" };
		for (int index = 0, id = 18304, y = 50; index < titles.length; index++, id += 3, y += 40) {
			addButton(id, 2, "/Interfaces/Clan Chat/sprite", "");
			interfaceCache[id].atActionType = 0;
			if (index > 0) {
				interfaceCache[id].actions = whoCan;
			} else {
				interfaceCache[id].actions = new String[] { "Change title",
						"Delete clan" };
				;
			}
			addText(id + 1, titles[index], tda, 0, 0xFF981F, true, true);
			addText(id + 2, defaults[index], tda, 1, 0xFFFFFF, true, true);
			rsi.child(count++, id, 25, y);
			rsi.child(count++, id + 1, 100, y + 4);
			rsi.child(count++, id + 2, 100, y + 17);
		}
		/* Table */
		addSprite(18319, 5, "/Interfaces/Clan Chat/sprite");
		rsi.child(count++, 18319, 197, 70);
		/* Labels */
		int id = 18320;
		int y = 74;
		addText(id, "Ranked Members", tda, 2, 0xFF981F, false, true);
		rsi.child(count++, id++, 202, y);
		addText(id, "Banned Members", tda, 2, 0xFF981F, false, true);
		rsi.child(count++, id++, 339, y);
		/* Ranked members list */
		RSInterface list = addInterface(id++);
		int lines = 100;
		list.totalChildren(lines);
		String[] ranks = { "Demote", "Recruit", "Corporal", "Sergeant",
				"Lieutenant", "Captain", "General", "Owner" };
		list.childY[0] = 2;
		// System.out.println(id);
		for (int index = id; index < id + lines; index++) {
			addText(index, "", tda, 1, 0xffffff, false, true);
			interfaceCache[index].actions = ranks;
			list.children[index - id] = index;
			list.childX[index - id] = 2;
			list.childY[index - id] = (index - id > 0 ? list.childY[index - id
					- 1] + 14 : 0);
		}
		id += lines;
		list.width = 119;
		list.height = 210;
		list.scrollMax = (lines * 14) + 2;
		rsi.child(count++, list.id, 199, 92);
		/* Banned members list */
		list = addInterface(id++);
		list.totalChildren(lines);
		list.childY[0] = 2;
		// System.out.println(id);
		for (int index = id; index < id + lines; index++) {
			addText(index, "", tda, 1, 0xffffff, false, true);
			interfaceCache[index].actions = new String[] { "Unban" };
			list.children[index - id] = index;
			list.childX[index - id] = 0;
			list.childY[index - id] = (index - id > 0 ? list.childY[index - id
					- 1] + 14 : 0);
		}
		id += lines;
		list.width = 119;
		list.height = 210;
		list.scrollMax = (lines * 14) + 2;
		rsi.child(count++, list.id, 339, 92);
		/* Table info text */
		y = 47;
		addText(id, "You can manage both ranked and banned members here.", tda,
				0, 0xFF981F, true, true);
		rsi.child(count++, id++, 337, y);
		addText(id, "Right click on a name to edit the member.", tda, 0,
				0xFF981F, true, true);
		rsi.child(count++, id++, 337, y + 11);
		/* Add ranked member button */
		y = 75;
		addButton(id, 0, "/Interfaces/Clan Chat/plus", "Add ranked member");
		interfaceCache[id].atActionType = 5;
		rsi.child(count++, id++, 319, y);
		/* Add banned member button */
		addButton(id, 0, "/Interfaces/Clan Chat/plus", "Add banned member");
		interfaceCache[id].atActionType = 5;
		rsi.child(count++, id++, 459, y);

		/* Hovers */
		int[] clanSetup = { 18302, 18304, 18307, 18310, 18313, 18316, 18526,
				18527 };
		String[] names = { "close", "sprite", "sprite", "sprite", "sprite",
				"sprite", "plus", "plus" };
		int[] ids = { 1, 3, 3, 3, 3, 3, 1, 1 };
		for (int index = 0; index < clanSetup.length; index++) {
			rsi = interfaceCache[clanSetup[index]];
			rsi.disabledHover = imageLoader(ids[index],
					"/Interfaces/Clan Chat/" + names[index]);
		}
	}

	public static void Pestpanel(TextDrawingArea[] tda) {
		RSInterface RSinterface = addTab(21119);
		addText(21120, "Next Departure:", 0xCCCBCB, false, true, 52, tda, 1);
		addText(21121, "Players Ready:", 0x5BD230, false, true, 52, tda, 1);
		addText(21122, "(Need 5 to 25 players)", 0xDED36A, false, true, 52,
				tda, 1);
		addText(21123, "Pest Points:", 0x99FFFF, false, true, 52, tda, 1);
		int last = 4;
		RSinterface.children = new int[last];
		RSinterface.childX = new int[last];
		RSinterface.childY = new int[last];
		setBounds(21120, 15, 12, 0, RSinterface);
		setBounds(21121, 15, 30, 1, RSinterface);
		setBounds(21122, 15, 48, 2, RSinterface);
		setBounds(21123, 15, 66, 3, RSinterface);

		RSInterface rsi = interfaceCache[6114] = new RSInterface();
		rsi.type = 4;
		rsi.width = 390;
		rsi.centerText = true;
	}

	public static void Pestpanel2(TextDrawingArea[] tda) {
		RSInterface RSinterface = addInterface(21100);
		addSprite(21101, 0, "Interfaces/Pest Control/PEST1");
		addSprite(21102, 1, "Interfaces/Pest Control/PEST1");
		addSprite(21103, 2, "Interfaces/Pest Control/PEST1");
		addSprite(21104, 3, "Interfaces/Pest Control/PEST1");
		addSprite(21105, 4, "Interfaces/Pest Control/PEST1");
		addSprite(21106, 5, "Interfaces/Pest Control/PEST1");
		addText(21107, "", 0xCC00CC, false, true, 52, tda, 1);
		addText(21108, "", 0x0000FF, false, true, 52, tda, 1);
		addText(21109, "", 0xFFFF44, false, true, 52, tda, 1);
		addText(21110, "", 0xCC0000, false, true, 52, tda, 1);
		addText(21111, "", 0x99FF33, false, true, 52, tda, 1);// w purp
		addText(21112, "", 0x99FF33, false, true, 52, tda, 1);// e blue
		addText(21113, "", 0x99FF33, false, true, 52, tda, 1);// se yel
		addText(21114, "", 0x99FF33, false, true, 52, tda, 1);// sw red
		addText(21115, "200", 0x99FF33, false, true, 52, tda, 1);// attacks
		addText(21116, "", 0x99FF33, false, true, 52, tda, 1);// knights hp
		addText(21117, "Time Remaining:", 0xFFFFFF, false, true, 52, tda, 0);
		addText(21118, "", 0xFFFFFF, false, true, 52, tda, 0);
		int last = 18;
		RSinterface.children = new int[last];
		RSinterface.childX = new int[last];
		RSinterface.childY = new int[last];
		setBounds(21101, 361, 26, 0, RSinterface);
		setBounds(21102, 396, 26, 1, RSinterface);
		setBounds(21103, 436, 26, 2, RSinterface);
		setBounds(21104, 474, 26, 3, RSinterface);
		setBounds(21105, 3, 21, 4, RSinterface);
		setBounds(21106, 3, 50, 5, RSinterface);
		setBounds(21107, 371, 60, 6, RSinterface);
		setBounds(21108, 409, 60, 7, RSinterface);
		setBounds(21109, 443, 60, 8, RSinterface);
		setBounds(21110, 479, 60, 9, RSinterface);
		setBounds(21111, 362, 10, 10, RSinterface);
		setBounds(21112, 398, 10, 11, RSinterface);
		setBounds(21113, 436, 10, 12, RSinterface);
		setBounds(21114, 475, 10, 13, RSinterface);
		setBounds(21115, 32, 32, 14, RSinterface);
		setBounds(21116, 32, 62, 15, RSinterface);
		setBounds(21117, 8, 88, 16, RSinterface);
		setBounds(21118, 87, 88, 17, RSinterface);
	}

	public static void godWars(TextDrawingArea[] tda) {
		RSInterface rsinterface = addTabInterface(16210);
		addText(16211, "NPC killcount", tda, 0, 0xff9040, true, true);
		addText(16212, "Armadyl kills", tda, 0, 0xff9040, true, true);
		addText(16213, "Bandos kills", tda, 0, 0xff9040, true, true);
		addText(16214, "Saradomin kills", tda, 0, 0xff9040, true, true);
		addText(16215, "Zamorak kills", tda, 0, 0xff9040, true, true);
		addText(16216, "0", tda, 0, 0x66FFFF, true, true);// armadyl
		addText(16217, "0", tda, 0, 0x66FFFF, true, true);// bandos
		addText(16218, "0", tda, 0, 0x66FFFF, true, true);// saradomin
		addText(16219, "0", tda, 0, 0x66FFFF, true, true);// zamorak
		rsinterface.scrollMax = 0;
		rsinterface.children = new int[9];
		rsinterface.childX = new int[9];
		rsinterface.childY = new int[9];
		rsinterface.children[0] = 16211;
		rsinterface.childX[0] = -52 + 375 + 30;
		rsinterface.childY[0] = 7;
		rsinterface.children[1] = 16212;
		rsinterface.childX[1] = -52 + 375 + 30;
		rsinterface.childY[1] = 30;
		rsinterface.children[2] = 16213;
		rsinterface.childX[2] = -52 + 375 + 30;
		rsinterface.childY[2] = 44;
		rsinterface.children[3] = 16214;
		rsinterface.childX[3] = -52 + 375 + 30;
		rsinterface.childY[3] = 58;
		rsinterface.children[4] = 16215;
		rsinterface.childX[4] = -52 + 375 + 30;
		rsinterface.childY[4] = 73;
		rsinterface.children[5] = 16216;
		rsinterface.childX[5] = -52 + 460 + 60;
		rsinterface.childY[5] = 31;
		rsinterface.children[6] = 16217;
		rsinterface.childX[6] = -52 + 460 + 60;
		rsinterface.childY[6] = 45;
		rsinterface.children[7] = 16218;
		rsinterface.childX[7] = -52 + 460 + 60;
		rsinterface.childY[7] = 59;
		rsinterface.children[8] = 16219;
		rsinterface.childX[8] = -52 + 460 + 60;
		rsinterface.childY[8] = 74;
	}

	public static void configureLunar(TextDrawingArea[] TDA) {
		constructLunar();
		homeTeleport();
		drawRune(30003, 1, "Fire");
		drawRune(30004, 2, "Water");
		drawRune(30005, 3, "Air");
		drawRune(30006, 4, "Earth");
		drawRune(30007, 5, "Mind");
		drawRune(30008, 6, "Body");
		drawRune(30009, 7, "Death");
		drawRune(30010, 8, "Nature");
		drawRune(30011, 9, "Chaos");
		drawRune(30012, 10, "Law");
		drawRune(30013, 11, "Cosmic");
		drawRune(30014, 12, "Blood");
		drawRune(30015, 13, "Soul");
		drawRune(30016, 14, "Astral");
		addLunar3RunesSmallBox(30017, 9075, 554, 555, 0, 4, 3, 30003, 30004,
				64, "Bake Pie", "Bake pies without a stove", TDA, 0, 16, 2);
		addLunar2RunesSmallBox(30025, 9075, 557, 0, 7, 30006, 65, "Cure Plant",
				"Cure disease on farming patch", TDA, 1, 4, 2);
		addLunar3RunesBigBox(30032, 9075, 564, 558, 0, 0, 0, 30013, 30007, 65,
				"Monster Examine",
				"Detect the combat statistics of a\\nmonster", TDA, 2, 2, 2);
		addLunar3RunesSmallBox(30040, 9075, 564, 556, 0, 0, 1, 30013, 30005,
				66, "NPC Contact", "Speak with varied NPCs", TDA, 3, 0, 2);
		addLunar3RunesSmallBox(30048, 9075, 563, 557, 0, 0, 9, 30012, 30006,
				67, "Cure Other", "Cure poisoned players", TDA, 4, 8, 2);
		addLunar3RunesSmallBox(30056, 9075, 555, 554, 0, 2, 0, 30004, 30003,
				67, "Humidify", "fills certain vessels with water", TDA, 5, 0,
				5);
		addLunar3RunesSmallBox(30064, 9075, 563, 557, 1, 0, 1, 30012, 30006,
				68, "Monster Teleport", "Teleport to training areas", TDA, 6,
				0, 5);
		addLunar3RunesBigBox(30075, 9075, 563, 557, 1, 0, 3, 30012, 30006, 69,
				"Minigame Teleport", "Teleport to various minigames", TDA, 7,
				0, 5);
		addLunar3RunesSmallBox(30083, 9075, 563, 557, 1, 0, 5, 30012, 30006,
				70, "Boss Teleport", "Teleport to powerful foes", TDA, 8, 0, 5);
		addLunar3RunesSmallBox(30091, 9075, 564, 563, 1, 1, 0, 30013, 30012,
				70, "Cure Me", "Cures Poison", TDA, 9, 0, 5);
		addLunar2RunesSmallBox(30099, 9075, 557, 1, 1, 30006, 70,
				"Skilling Kit", "Get skilling tools!", TDA, 10, 0, 5);
		addLunar3RunesSmallBox(30106, 9075, 563, 555, 1, 0, 0, 30012, 30004,
				71, "PvP Teleport", "Teleport Pking spots", TDA, 11, 0, 5);
		addLunar3RunesBigBox(30114, 9075, 563, 555, 1, 0, 4, 30012, 30004, 72,
				"Skill Teleport", "Teleport to skilling areas", TDA, 12, 0, 5);
		addLunar3RunesSmallBox(30122, 9075, 564, 563, 1, 1, 1, 30013, 30012,
				73, "Cure Group", "Cures Poison on players", TDA, 13, 0, 5);
		addLunar3RunesBigBox(30130, 9075, 564, 559, 1, 1, 4, 30013, 30008, 74,
				"Stat Spy",
				"Cast on another player to see their\\nskill levels", TDA, 14,
				8, 2);
		addLunar3RunesBigBox(30138, 9075, 563, 554, 1, 1, 2, 30012, 30003, 74,
				"More-skill-masters Teleport",
				"Teleports you to the Barbarian\\noutpost", TDA, 15, 0, 5);
		addLunar3RunesBigBox(30146, 9075, 563, 554, 1, 1, 5, 30012, 30003, 75,
				"Tele Group Barbarian",
				"Teleports players to the Barbarian\\noutpost", TDA, 16, 0, 5);
		addLunar3RunesSmallBox(30154, 9075, 554, 556, 1, 5, 9, 30003, 30005,
				76, "Superglass Make", "Make glass without a furnace", TDA, 17,
				16, 2);
		addLunar3RunesSmallBox(30162, 9075, 563, 555, 1, 1, 3, 30012, 30004,
				77, "Khazard Teleport", "Teleports you to Port khazard", TDA,
				18, 0, 5);
		addLunar3RunesSmallBox(30170, 9075, 563, 555, 1, 1, 7, 30012, 30004,
				78, "Tele Group Khazard", "Teleports players to Port khazard",
				TDA, 19, 0, 5);
		addLunar3RunesBigBox(30178, 9075, 564, 559, 1, 0, 4, 30013, 30008, 78,
				"Dream", "Take a rest and restore hitpoints 3\\n times faster",
				TDA, 20, 0, 5);
		addLunar3RunesSmallBox(30186, 9075, 557, 555, 1, 9, 4, 30006, 30004,
				79, "String Jewellery", "String amulets without wool", TDA, 21,
				0, 5);
		addLunar3RunesLargeBox(30194, 9075, 557, 555, 1, 9, 9, 30006, 30004,
				80, "Stat Restore Pot\\nShare",
				"Share a potion with up to 4 nearby\\nplayers", TDA, 22, 0, 5);
		addLunar3RunesSmallBox(30202, 9075, 554, 555, 1, 6, 6, 30003, 30004,
				81, "Magic Imbue", "Combine runes without a talisman", TDA, 23,
				0, 5);
		addLunar3RunesBigBox(30210, 9075, 561, 557, 2, 1, 14, 30010, 30006, 82,
				"Fertile Soil",
				"Fertilise a farming patch with super\\ncompost", TDA, 24, 4, 2);
		addLunar3RunesBigBox(30218, 9075, 557, 555, 2, 11, 9, 30006, 30004, 83,
				"Boost Potion Share",
				"Shares a potion with up to 4 nearby\\nplayers", TDA, 25, 0, 5);
		addLunar3RunesSmallBox(30226, 9075, 563, 555, 2, 2, 9, 30012, 30004,
				84, "Fishing Guild Teleport",
				"Teleports you to the fishing guild", TDA, 26, 0, 5);
		addLunar3RunesLargeBox(30234, 9075, 563, 555, 1, 2, 13, 30012, 30004,
				85, "Tele Group Fishing\\nGuild",
				"Teleports players to the Fishing\\nGuild", TDA, 27, 0, 5);
		addLunar3RunesSmallBox(30242, 9075, 557, 561, 2, 14, 0, 30006, 30010,
				85, "Plank Make", "Turn Logs into planks", TDA, 28, 16, 5);
		/******** Cut Off Limit **********/
		addLunar3RunesSmallBox(30250, 9075, 563, 555, 2, 2, 9, 30012, 30004,
				86, "Catherby Teleport", "Teleports you to Catherby", TDA, 29,
				0, 5);
		addLunar3RunesSmallBox(30258, 9075, 563, 555, 2, 2, 14, 30012, 30004,
				87, "Tele Group Catherby", "Teleports players to Catherby",
				TDA, 30, 0, 5);
		addLunar3RunesSmallBox(30266, 9075, 563, 555, 2, 2, 7, 30012, 30004,
				88, "Ice Plateau Teleport", "Teleports you to Ice Plateau",
				TDA, 31, 0, 5);
		addLunar3RunesBigBox(30274, 9075, 563, 555, 2, 2, 15, 30012, 30004, 89,
				"Tele Group Ice\\n Plateau",
				"Teleports players to Ice Plateau", TDA, 32, 0, 5);
		addLunar3RunesBigBox(
				30282,
				9075,
				563,
				561,
				2,
				1,
				0,
				30012,
				30010,
				90,
				"Energy Transfer",
				"Spend hitpoints and SA Energy to\\n give another player hitpoints and run energy",
				TDA, 33, 8, 2);
		addLunar3RunesBigBox(30290, 9075, 563, 565, 2, 2, 0, 30012, 30014, 91,
				"Heal Other",
				"Transfer up to 75% of hitpoints\\n to another player", TDA,
				34, 8, 2);
		addLunar3RunesBigBox(30298, 9075, 560, 557, 2, 1, 9, 30009, 30006, 92,
				"Vengeance Other",
				"Allows another player to rebound\\ndamage to an opponent",
				TDA, 35, 8, 2);
		addLunar3RunesSmallBox(30306, 9075, 560, 557, 3, 1, 9, 30009, 30006,
				93, "Vengeance", "Rebound damage to an opponent", TDA, 36, 0, 5);
		addLunar3RunesBigBox(30314, 9075, 565, 563, 3, 2, 5, 30014, 30012, 94,
				"Heal Group", "Transfer up to 75% of hitpoints to a group",
				TDA, 37, 0, 5);
		addLunar3RunesBigBox(30322, 9075, 564, 563, 2, 1, 0, 30013, 30012, 95,
				"Spellbook Swap",
				"Change to another spellbook for 1\\nspell cast", TDA, 38, 0, 5);
	}

	public static void constructLunar() {
		RSInterface Interface = addInterface(29999);
		Interface.totalChildren(80);
		setBounds(30000, 11, 10, 0, Interface);
		setBounds(30017, 40, 9, 1, Interface);
		setBounds(30025, 71, 12, 2, Interface);
		setBounds(30032, 103, 10, 3, Interface);
		setBounds(30040, 135, 12, 4, Interface);
		setBounds(30048, 165, 10, 5, Interface);
		setBounds(30056, 8, 38, 6, Interface);
		setBounds(30064, 39, 39, 7, Interface);
		setBounds(30075, 71, 39, 8, Interface);
		setBounds(30083, 103, 39, 9, Interface);
		setBounds(30091, 135, 39, 10, Interface);
		setBounds(30099, 165, 37, 11, Interface);
		setBounds(30106, 12, 68, 12, Interface);
		setBounds(30114, 42, 68, 13, Interface);
		setBounds(30122, 71, 68, 14, Interface);
		setBounds(30130, 103, 68, 15, Interface);
		setBounds(30138, 135, 68, 16, Interface);
		setBounds(30146, 165, 68, 17, Interface);
		setBounds(30154, 14, 97, 18, Interface);
		setBounds(30162, 42, 97, 19, Interface);
		setBounds(30170, 71, 97, 20, Interface);
		setBounds(30178, 101, 97, 21, Interface);
		setBounds(30186, 135, 98, 22, Interface);
		setBounds(30194, 168, 98, 23, Interface);
		setBounds(30202, 11, 125, 24, Interface);
		setBounds(30210, 42, 124, 25, Interface);
		setBounds(30218, 74, 125, 26, Interface);
		setBounds(30226, 103, 125, 27, Interface);
		setBounds(30234, 135, 125, 28, Interface);
		setBounds(30242, 164, 126, 29, Interface);
		setBounds(30250, 10, 155, 30, Interface);
		setBounds(30258, 42, 155, 31, Interface);
		setBounds(30266, 71, 155, 32, Interface);
		setBounds(30274, 103, 155, 33, Interface);
		setBounds(30282, 136, 155, 34, Interface);
		setBounds(30290, 165, 155, 35, Interface);
		setBounds(30298, 13, 185, 36, Interface);
		setBounds(30306, 42, 185, 37, Interface);
		setBounds(30314, 71, 184, 38, Interface);
		setBounds(30322, 104, 184, 39, Interface);
		setBounds(30001, 6, 184, 40, Interface);// hover
		setBounds(30018, 5, 176, 41, Interface);// hover
		setBounds(30026, 5, 176, 42, Interface);// hover
		setBounds(30033, 5, 163, 43, Interface);// hover
		setBounds(30041, 5, 176, 44, Interface);// hover
		setBounds(30049, 5, 176, 45, Interface);// hover
		setBounds(30057, 5, 176, 46, Interface);// hover
		setBounds(30065, 5, 176, 47, Interface);// hover
		setBounds(30076, 5, 163, 48, Interface);// hover
		setBounds(30084, 5, 176, 49, Interface);// hover
		setBounds(30092, 5, 176, 50, Interface);// hover
		setBounds(30100, 5, 176, 51, Interface);// hover
		setBounds(30107, 5, 176, 52, Interface);// hover
		setBounds(30115, 5, 163, 53, Interface);// hover
		setBounds(30123, 5, 176, 54, Interface);// hover
		setBounds(30131, 5, 163, 55, Interface);// hover
		setBounds(30139, 5, 163, 56, Interface);// hover
		setBounds(30147, 5, 163, 57, Interface);// hover
		setBounds(30155, 5, 176, 58, Interface);// hover
		setBounds(30163, 5, 176, 59, Interface);// hover
		setBounds(30171, 5, 176, 60, Interface);// hover
		setBounds(30179, 5, 163, 61, Interface);// hover
		setBounds(30187, 5, 176, 62, Interface);// hover
		setBounds(30195, 5, 149, 63, Interface);// hover
		setBounds(30203, 5, 176, 64, Interface);// hover
		setBounds(30211, 5, 163, 65, Interface);// hover
		setBounds(30219, 5, 163, 66, Interface);// hover
		setBounds(30227, 5, 176, 67, Interface);// hover
		setBounds(30235, 5, 149, 68, Interface);// hover
		setBounds(30243, 5, 176, 69, Interface);// hover

		setBounds(30251, 5, 5, 70, Interface);// hover
		setBounds(30259, 5, 5, 71, Interface);// hover
		setBounds(30267, 5, 5, 72, Interface);// hover
		setBounds(30275, 5, 5, 73, Interface);// hover
		setBounds(30283, 5, 5, 74, Interface);// hover
		setBounds(30291, 5, 5, 75, Interface);// hover
		setBounds(30299, 5, 5, 76, Interface);// hover
		setBounds(30307, 5, 5, 77, Interface);// hover
		setBounds(30323, 5, 5, 78, Interface);// hover
		setBounds(30315, 5, 5, 79, Interface);// hover
	}

	public static void Logout(TextDrawingArea[] wid) {
		RSInterface rsinterface = interfaceCache[2449];
		rsinterface.childX[0] = 8;
		rsinterface.childY[0] = 68;
		rsinterface.childX[1] = 10;
		rsinterface.childY[1] = 86;
		rsinterface.childX[2] = 12;
		rsinterface.childY[2] = 104;
		rsinterface.childX[8] = 29;
		rsinterface.childY[8] = 164;
		rsinterface = interfaceCache[2450];
		rsinterface.textColor = 0xff981f;
		rsinterface = interfaceCache[2451];
		rsinterface.textColor = 0xff981f;
		rsinterface = interfaceCache[2452];
		rsinterface.textColor = 0xff981f;
	}

	public static void emoteTab() {
		RSInterface tab = addTabInterface(147);
		RSInterface scroll = addTabInterface(148);
		tab.totalChildren(1);
		tab.child(0, 148, 0, 1);
		addButton(168, 0, "Emotes/EMOTE", "Yes");
		addButton(169, 1, "Emotes/EMOTE", "No");
		addButton(164, 2, "Emotes/EMOTE", "Bow");
		addButton(165, 3, "Emotes/EMOTE", "Angry");
		addButton(162, 4, "Emotes/EMOTE", "Think");
		addButton(163, 5, "Emotes/EMOTE", "Wave");
		addButton(13370, 6, "Emotes/EMOTE", "Shrug");
		addButton(171, 7, "Emotes/EMOTE", "Cheer");
		addButton(167, 8, "Emotes/EMOTE", "Beckon");
		addButton(170, 9, "Emotes/EMOTE", "Laugh");
		addButton(13366, 10, "Emotes/EMOTE", "Jump for Joy");
		addButton(13368, 11, "Emotes/EMOTE", "Yawn");
		addButton(166, 12, "Emotes/EMOTE", "Dance");
		addButton(13363, 13, "Emotes/EMOTE", "Jig");
		addButton(13364, 14, "Emotes/EMOTE", "Spin");
		addButton(13365, 15, "Emotes/EMOTE", "Headbang");
		addButton(161, 16, "Emotes/EMOTE", "Cry");
		addButton(11100, 17, "Emotes/EMOTE", "Blow kiss");
		addButton(13362, 18, "Emotes/EMOTE", "Panic");
		addButton(13367, 19, "Emotes/EMOTE", "Raspberry");
		addButton(172, 20, "Emotes/EMOTE", "Clap");
		addButton(13369, 21, "Emotes/EMOTE", "Salute");
		addButton(13383, 22, "Emotes/EMOTE", "Goblin Bow");
		addButton(13384, 23, "Emotes/EMOTE", "Goblin Salute");
		addButton(667, 24, "Emotes/EMOTE", "Glass Box");
		addButton(6503, 25, "Emotes/EMOTE", "Climb Rope");
		addButton(6506, 26, "Emotes/EMOTE", "Lean On Air");
		addButton(666, 27, "Emotes/EMOTE", "Glass Wall");
		addButton(18464, 28, "Emotes/EMOTE", "Zombie Walk");
		addButton(18465, 29, "Emotes/EMOTE", "Zombie Dance");
		addButton(15166, 30, "Emotes/EMOTE", "Scared");
		addButton(18686, 31, "Emotes/EMOTE", "Rabbit Hop");
		addConfigButton(154, 147, 32, 33, "Emotes/EMOTE", 41, 47,
				"Skillcape Emote", 0, 1, 700);
		scroll.totalChildren(33);
		scroll.child(0, 168, 10, 7);
		scroll.child(1, 169, 54, 7);
		scroll.child(2, 164, 98, 14);
		scroll.child(3, 165, 137, 7);
		scroll.child(4, 162, 9, 56);
		scroll.child(5, 163, 48, 56);
		scroll.child(6, 13370, 95, 56);
		scroll.child(7, 171, 137, 56);
		scroll.child(8, 167, 7, 105);
		scroll.child(9, 170, 51, 105);
		scroll.child(10, 13366, 95, 104);
		scroll.child(11, 13368, 139, 105);
		scroll.child(12, 166, 6, 154);
		scroll.child(13, 13363, 50, 154);
		scroll.child(14, 13364, 90, 154);
		scroll.child(15, 13365, 135, 154);
		scroll.child(16, 161, 8, 204);
		scroll.child(17, 11100, 51, 203);
		scroll.child(18, 13362, 99, 204);
		scroll.child(19, 13367, 137, 203);
		scroll.child(20, 172, 10, 253);
		scroll.child(21, 13369, 53, 253);
		scroll.child(22, 13383, 88, 258);
		scroll.child(23, 13384, 138, 252);
		scroll.child(24, 667, 2, 303);
		scroll.child(25, 6503, 49, 302);
		scroll.child(26, 6506, 93, 302);
		scroll.child(27, 666, 137, 302);
		scroll.child(28, 18464, 9, 352);
		scroll.child(29, 18465, 50, 352);
		scroll.child(30, 15166, 94, 356);
		scroll.child(31, 18686, 141, 353);
		scroll.child(32, 154, 5, 401);
		scroll.width = 173;
		scroll.height = 258;
		scroll.scrollMax = 450;
	}

	public static void equipmentTab(TextDrawingArea[] wid) {
		RSInterface Interface = interfaceCache[1644];
		addSprite(15101, 0, "Equipment/bl");// cheap hax
		addSprite(15102, 1, "Equipment/bl");// cheap hax
		addSprite(15109, 2, "Equipment/bl");// cheap hax
		removeSomething(15103);
		removeSomething(15104);
		Interface.children[23] = 15101;
		Interface.childX[23] = 40;
		Interface.childY[23] = 205;
		Interface.children[24] = 15102;
		Interface.childX[24] = 110;
		Interface.childY[24] = 205;
		Interface.children[25] = 15109;
		Interface.childX[25] = 39;
		Interface.childY[25] = 240;
		Interface.children[26] = 27650;
		Interface.childX[26] = 0;
		Interface.childY[26] = 0;
		Interface = addInterface(27650);
		addButton(27653, 1, "Equipment/BOX", "Show Equipment Stats", 27655, 1,
				40, 39);
		addTooltip(27655, "Show Equipment Stats");
		addButton(27654, 2, "Equipment/BOX", "Show Items Kept on Death", 27657,
				1, 40, 39);
		addTooltip(27657, "Show Items Kept on Death");
		setChildren(4, Interface);
		setBounds(27653, 29, 205, 0, Interface);
		setBounds(27654, 124, 205, 1, Interface);
		setBounds(27655, 39, 240, 2, Interface);
		setBounds(27657, 39, 220, 3, Interface);
	}

	public static void equipmentScreen(TextDrawingArea[] wid) {
		RSInterface Interface = RSInterface.interfaceCache[1644];
		addButton(19144, 6, "Equipment/CUSTOM", "Show Equipment Stats");
		removeSomething(19145);
		removeSomething(19146);
		removeSomething(19147);
		setBounds(19144, 21, 210, 23, Interface);
		setBounds(19145, 40, 210, 24, Interface);
		setBounds(19146, 40, 210, 25, Interface);
		setBounds(19147, 40, 210, 26, Interface);
		RSInterface tab = addTabInterface(15106);
		addSprite(15107, 7, "Equipment/CUSTOM");
		addHoverButton(15210, "Equipment/CUSTOM", 8, 21, 21, "Close", 250,
				15211, 3);
		addHoveredButton(15211, "Equipment/CUSTOM", 9, 21, 21, 15212);
		addText(15111, "Equip Your Character...", wid, 2, 0xe4a146, false, true);
		addText(15112, "Attack bonus", wid, 2, 0xe4a146, false, true);
		addText(15113, "Defence bonus", wid, 2, 0xe4a146, false, true);
		addText(15114, "Other bonuses", wid, 2, 0xe4a146, false, true);
		for (int i = 1675; i <= 1684; i++) {
			textSize(i, wid, 1);
		}
		textSize(1686, wid, 1);
		textSize(1687, wid, 1);
		addChar(15125);
		tab.totalChildren(44);
		tab.child(0, 15107, 4, 20);
		tab.child(1, 15210, 476, 29);
		tab.child(2, 15211, 476, 29);
		tab.child(3, 15111, 14, 30);
		int Child = 4;
		int Y = 69;
		for (int i = 1675; i <= 1679; i++) {
			tab.child(Child, i, 20, Y);
			Child++;
			Y += 14;
		}
		tab.child(9, 1680, 20, 161);
		tab.child(10, 1681, 20, 177);
		tab.child(11, 1682, 20, 192);
		tab.child(12, 1683, 20, 207);
		tab.child(13, 1684, 20, 221);
		tab.child(14, 1686, 20, 262);
		tab.child(15, 15125, 170, 200);
		tab.child(16, 15112, 16, 55);
		tab.child(17, 1687, 20, 276);
		tab.child(18, 15113, 16, 147);
		tab.child(19, 15114, 16, 248);
		tab.child(20, 1645, 104 + 295, 149 - 52);
		tab.child(21, 1646, 399, 163);
		tab.child(22, 1647, 399, 163);
		tab.child(23, 1648, 399, 58 + 146);
		tab.child(24, 1649, 26 + 22 + 297 - 2, 110 - 44 + 118 - 13 + 5);
		tab.child(25, 1650, 321 + 22, 58 + 154);
		tab.child(26, 1651, 321 + 134, 58 + 118);
		tab.child(27, 1652, 321 + 134, 58 + 154);
		tab.child(28, 1653, 321 + 48, 58 + 81);
		tab.child(29, 1654, 321 + 107, 58 + 81);
		tab.child(30, 1655, 321 + 58, 58 + 42);
		tab.child(31, 1656, 321 + 112, 58 + 41);
		tab.child(32, 1657, 321 + 78, 58 + 4);
		tab.child(33, 1658, 321 + 37, 58 + 43);
		tab.child(34, 1659, 321 + 78, 58 + 43);
		tab.child(35, 1660, 321 + 119, 58 + 43);
		tab.child(36, 1661, 321 + 22, 58 + 82);
		tab.child(37, 1662, 321 + 78, 58 + 82);
		tab.child(38, 1663, 321 + 134, 58 + 82);
		tab.child(39, 1664, 321 + 78, 58 + 122);
		tab.child(40, 1665, 321 + 78, 58 + 162);
		tab.child(41, 1666, 321 + 22, 58 + 162);
		tab.child(42, 1667, 321 + 134, 58 + 162);
		tab.child(43, 1688, 50 + 297 - 2, 110 - 13 + 5);
		for (int i = 1675; i <= 1684; i++) {
			RSInterface rsi = interfaceCache[i];
			rsi.textColor = 0xe4a146;
			rsi.centerText = false;
		}
		for (int i = 1686; i <= 1687; i++) {
			RSInterface rsi = interfaceCache[i];
			rsi.textColor = 0xe4a146;
			rsi.centerText = false;
		}
	}

	public static void itemsOnDeath(TextDrawingArea[] wid) {
		RSInterface rsinterface = addInterface(17100);
		addSprite(17101, 2, 2);
		addHover(17102, 3, 0, 10601, 1, "Interfaces/Equipment/SPRITE", 17, 17,
				"Close Window");
		addHovered(10601, 3, "Interfaces/Equipment/SPRITE", 17, 17, 10602);
		addText(17103, "Items kept on death", wid, 2, 0xff981f);
		addText(17104, "Items I will keep...", wid, 1, 0xff981f);
		addText(17105, "Items I will lose...", wid, 1, 0xff981f);
		addText(17106, "Info", wid, 1, 0xff981f);
		addText(17107, "RuneScape", wid, 1, 0xffcc33);
		addText(17108, "", wid, 1, 0xffcc33);
		rsinterface.scrollMax = 0;
		rsinterface.isMouseoverTriggered = false;
		rsinterface.children = new int[12];
		rsinterface.childX = new int[12];
		rsinterface.childY = new int[12];

		rsinterface.children[0] = 17101;
		rsinterface.childX[0] = 7;
		rsinterface.childY[0] = 8;
		rsinterface.children[1] = 17102;
		rsinterface.childX[1] = 480;
		rsinterface.childY[1] = 17;
		rsinterface.children[2] = 17103;
		rsinterface.childX[2] = 185;
		rsinterface.childY[2] = 18;
		rsinterface.children[3] = 17104;
		rsinterface.childX[3] = 22;
		rsinterface.childY[3] = 50;
		rsinterface.children[4] = 17105;
		rsinterface.childX[4] = 22;
		rsinterface.childY[4] = 110;
		rsinterface.children[5] = 17106;
		rsinterface.childX[5] = 347;
		rsinterface.childY[5] = 47;
		rsinterface.children[6] = 17107;
		rsinterface.childX[6] = 349;
		rsinterface.childY[6] = 270;
		rsinterface.children[7] = 17108;
		rsinterface.childX[7] = 398;
		rsinterface.childY[7] = 298;
		rsinterface.children[8] = 17115;
		rsinterface.childX[8] = 348;
		rsinterface.childY[8] = 64;
		rsinterface.children[9] = 10494;
		rsinterface.childX[9] = 26;
		rsinterface.childY[9] = 74;
		rsinterface.children[10] = 10600;
		rsinterface.childX[10] = 26;
		rsinterface.childY[10] = 133;
		rsinterface.children[11] = 10601;
		rsinterface.childX[11] = 480;
		rsinterface.childY[11] = 17;
	}

	public static void itemsOnDeathDATA(TextDrawingArea[] wid) {
		RSInterface rsinterface = addInterface(17115);
		addText(17109, "a", wid, 0, 0xff981f);
		addText(17110, "b", wid, 0, 0xff981f);
		addText(17111, "c", wid, 0, 0xff981f);
		addText(17112, "d", wid, 0, 0xff981f);
		addText(17113, "e", wid, 0, 0xff981f);
		addText(17114, "f", wid, 0, 0xff981f);
		addText(17117, "g", wid, 0, 0xff981f);
		addText(17118, "h", wid, 0, 0xff981f);
		addText(17119, "i", wid, 0, 0xff981f);
		addText(17120, "j", wid, 0, 0xff981f);
		addText(17121, "k", wid, 0, 0xff981f);
		addText(17122, "l", wid, 0, 0xff981f);
		addText(17123, "m", wid, 0, 0xff981f);
		addText(17124, "n", wid, 0, 0xff981f);
		addText(17125, "o", wid, 0, 0xff981f);
		addText(17126, "p", wid, 0, 0xff981f);
		addText(17127, "q", wid, 0, 0xff981f);
		addText(17128, "r", wid, 0, 0xff981f);
		addText(17129, "s", wid, 0, 0xff981f);
		addText(17130, "t", wid, 0, 0xff981f);
		rsinterface.parentID = 17115;
		rsinterface.id = 17115;
		rsinterface.type = 0;
		rsinterface.atActionType = 0;
		rsinterface.contentType = 0;
		rsinterface.width = 130;
		rsinterface.height = 197;
		rsinterface.aByte254 = 0;
		rsinterface.mOverInterToTrigger = -1;
		rsinterface.scrollMax = 280;
		rsinterface.children = new int[20];
		rsinterface.childX = new int[20];
		rsinterface.childY = new int[20];
		rsinterface.children[0] = 17109;
		rsinterface.childX[0] = 0;
		rsinterface.childY[0] = 0;
		rsinterface.children[1] = 17110;
		rsinterface.childX[1] = 0;
		rsinterface.childY[1] = 12;
		rsinterface.children[2] = 17111;
		rsinterface.childX[2] = 0;
		rsinterface.childY[2] = 24;
		rsinterface.children[3] = 17112;
		rsinterface.childX[3] = 0;
		rsinterface.childY[3] = 36;
		rsinterface.children[4] = 17113;
		rsinterface.childX[4] = 0;
		rsinterface.childY[4] = 48;
		rsinterface.children[5] = 17114;
		rsinterface.childX[5] = 0;
		rsinterface.childY[5] = 60;
		rsinterface.children[6] = 17117;
		rsinterface.childX[6] = 0;
		rsinterface.childY[6] = 72;
		rsinterface.children[7] = 17118;
		rsinterface.childX[7] = 0;
		rsinterface.childY[7] = 84;
		rsinterface.children[8] = 17119;
		rsinterface.childX[8] = 0;
		rsinterface.childY[8] = 96;
		rsinterface.children[9] = 17120;
		rsinterface.childX[9] = 0;
		rsinterface.childY[9] = 108;
		rsinterface.children[10] = 17121;
		rsinterface.childX[10] = 0;
		rsinterface.childY[10] = 120;
		rsinterface.children[11] = 17122;
		rsinterface.childX[11] = 0;
		rsinterface.childY[11] = 132;
		rsinterface.children[12] = 17123;
		rsinterface.childX[12] = 0;
		rsinterface.childY[12] = 144;
		rsinterface.children[13] = 17124;
		rsinterface.childX[13] = 0;
		rsinterface.childY[13] = 156;
		rsinterface.children[14] = 17125;
		rsinterface.childX[14] = 0;
		rsinterface.childY[14] = 168;
		rsinterface.children[15] = 17126;
		rsinterface.childX[15] = 0;
		rsinterface.childY[15] = 180;
		rsinterface.children[16] = 17127;
		rsinterface.childX[16] = 0;
		rsinterface.childY[16] = 192;
		rsinterface.children[17] = 17128;
		rsinterface.childX[17] = 0;
		rsinterface.childY[17] = 204;
		rsinterface.children[18] = 17129;
		rsinterface.childX[18] = 0;
		rsinterface.childY[18] = 216;
		rsinterface.children[19] = 17130;
		rsinterface.childX[19] = 0;
		rsinterface.childY[19] = 228;
	}

	public static void Sidebar0(TextDrawingArea[] tda) {
		Sidebar0a(1698, 1701, 7499, "Chop", "Hack", "Smash", "Block", 42, 75,
				127, 75, 39, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103,
				tda, "Accurate\nSlash\nAttack XP",
				"Aggressive\nSlash\nStrength XP",
				"Aggressive\nCrush\nStrength XP",
				"Defensive\nSlash\nDefence XP", 40132, 40136, 40140, 40144); // OK

		Sidebar0a(2276, 2279, 7574, "Stab", "Lunge", "Slash", "Block", 43, 75,
				124, 75, 41, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103,
				tda, "Accurate\nStab\nAttack XP",
				"Aggressive\nStab\nStrength XP",
				"Aggressive\nSlash\nStrength XP",
				"Defensive\nStab\nDefence XP", 40020, 40024, 40028, 40032); // OK

		Sidebar0a(2423, 2426, 7599, "Chop", "Slash", "Lunge", "Block", 42, 75,
				125, 75, 40, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103,
				tda, "Accurate\nSlash\nAttack XP",
				"Aggressive\nSlash\nStrength XP",
				"Controlled\nStab\nShared XP", "Defensive\nSlash\nDefence XP",
				40036, 40040, 40044, 40048); // OK

		Sidebar0a(3796, 3799, 7624, "Pound", "Pummel", "Spike", "Block", 39,
				75, 121, 75, 41, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40,
				103, tda, "", "", "", "", 40052, 40056, 40060, 40064); // WTF IS
																		// THIS?!

		Sidebar0a(4679, 4682, 7674, "Lunge", "Swipe", "Pound", "Block", 40, 75,
				124, 75, 39, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103,
				tda, "Controlled\nStab\nShared XP",
				"Controlled\nSlash\nShared XP", "Controlled\nCrush\nShared XP",
				"Defensive\nStab\nDefence XP", 40068, 40072, 40076, 40080); // OK

		Sidebar0a(4705, 4708, 7699, "Chop", "Slash", "Smash", "Block", 42, 75,
				125, 75, 39, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103,
				tda, "Accurate\nSlash\nAttack XP",
				"Aggressive\nSlash\nStrength XP",
				"Aggressive\nCrush\nStrength XP",
				"Defensive\nSlash\nDefence XP", 40084, 40088, 40092, 40096); // ???

		Sidebar0a(5570, 5573, 7724, "Spike", "Impale", "Smash", "Block", 41,
				75, 123, 75, 39, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40,
				103, tda, "Accurate\nStab\nAttack XP",
				"Aggressive\nStab\nStrength XP",
				"Aggressive\nCrush\nStrength XP",
				"Defensive\nStab\nDefence XP", 40010, 40104, 40108, 40112); // OK

		Sidebar0a(7762, 7765, 7800, "Chop", "Slash", "Lunge", "Block", 42, 75,
				125, 75, 40, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103,
				tda, "Accurate\nSlash\nAttack XP",
				"Aggressive\nSlash\nStrength XP",
				"Controlled\nStab\nShared XP", "Defensive\nSlash\nDefence XP",
				40116, 40120, 40124, 40128); // OK

		Sidebar0b(776, 779, "Reap", "Chop", "Jab", "Block", 42, 75, 126, 75,
				46, 128, 125, 128, 122, 103, 122, 50, 40, 103, 40, 50, tda, "",
				"", "", "", 40132, 40136, 40140, 40144); // ???

		Sidebar0c(425, 428, 7474, "Pound", "Pummel", "Block", 39, 75, 121, 75,
				42, 128, 40, 103, 40, 50, 122, 50, tda,
				"Accurate\nCrush\nAttack XP", "Aggressive\nCrush\nDefence XP",
				"Defensive\nCrush\nDefence XP", 40148, 40152, 40156); // OK

		Sidebar0c(1749, 1752, 7524, "Accurate", "Rapid", "Longrange", 33, 75,
				125, 75, 29, 128, 40, 103, 40, 50, 122, 50, tda,
				"Accurate\nRanged XP", "Rapid\nRanged XP",
				"Long range\nRanged XP\nDefence XP", 40160, 40164, 40168); // OK

		Sidebar0c(1764, 1767, 7549, "Accurate", "Rapid", "Longrange", 33, 75,
				125, 75, 29, 128, 40, 103, 40, 50, 122, 50, tda,
				"Accurate\nRanged XP", "Rapid\nRanged XP",
				"Long range\nRanged XP\nDefence XP", 40172, 40176, 40180); // OK

		Sidebar0c(4446, 4449, 7649, "Accurate", "Rapid", "Longrange", 33, 75,
				125, 75, 29, 128, 40, 103, 40, 50, 122, 50, tda,
				"Accurate\nRanged XP", "Rapid\nRanged XP",
				"Long range\nRanged XP\nDefence XP", 40184, 40188, 40192); // OK

		Sidebar0c(5855, 5857, 7749, "Punch", "Kick", "Block", 40, 75, 129, 75,
				42, 128, 40, 50, 122, 50, 40, 103, tda,
				"Accurate\nCrush\nAttack XP", "Aggressive\nCrush\nStrength XP",
				"Defensive\nCrush\nDefence XP", 40196, 40200, 40204); // OK

		Sidebar0c(6103, 6132, 6117, "Bash", "Pound", "Block", 43, 75, 124, 75,
				42, 128, 40, 103, 40, 50, 122, 50, tda,
				"Accurate\nCrush\nAttack XP", "Aggressive\nCrush\nStrength XP",
				"Defensive\nCrush\nDefence XP", 40208, 40212, 40216); // ???

		Sidebar0c(8460, 8463, 8493, "Jab", "Swipe", "Fend", 46, 75, 124, 75,
				43, 128, 40, 103, 40, 50, 122, 50, tda,
				"Controlled\nStabbed\nShared XP",
				"Aggressive\nSlash\nStrength XP",
				"Defensive\nStab\nDefence XP", 40224, 40228, 40232); // OK

		Sidebar0c(12290, 12293, 12323, "Flick", "Lash", "Deflect", 44, 75, 127,
				75, 36, 128, 40, 50, 40, 103, 122, 50, tda,
				"Accurate\nSlash\nAttack XP", "Controlled\nSlash\nShared XP",
				"Defensive\nSlash\nDefence XP", 40236, 40240, 40244); // OK

		Sidebar0d(328, 331, "Bash", "Pound", "Focus", 42, 66, 39, 101, 41, 136,
				40, 120, 40, 50, 40, 85, tda);

		RSInterface rsi = addTabInterface(19300);
		textSize(3983, tda, 0);
		addAttackStyleButton2(
				150,
				150,
				172,
				150,
				44,
				"Auto Retaliate",
				40000,
				154,
				42,
				"When active, you will\nautomatically fight back if\nattacked.",
				tda);

		rsi.totalChildren(3);
		rsi.child(0, 3983, 52, 25); // combat level
		rsi.child(1, 150, 21, 153); // auto retaliate
		rsi.child(2, 40000, 26, 200);

		rsi = interfaceCache[3983];
		rsi.centerText = true;
		rsi.textColor = 0xff981f;
	}

	public static void Sidebar0a(int id, int id2, int id3, String text1,
			String text2, String text3, String text4, int str1x, int str1y,
			int str2x, int str2y, int str3x, int str3y, int str4x, int str4y,
			int img1x, int img1y, int img2x, int img2y, int img3x, int img3y,
			int img4x, int img4y, TextDrawingArea[] tda, String popupString1,
			String popupString2, String popupString3, String popupString4,
			int hoverID1, int hoverID2, int hoverID3, int hoverID4) // 4button
																	// spec
	{
		RSInterface rsi = addTabInterface(id); // 2423
		addAttackText(id2, "-2", tda, 3, 0xff981f, true); // 2426
		addAttackText(id2 + 11, text1, tda, 0, 0xff981f, false);
		addAttackText(id2 + 12, text2, tda, 0, 0xff981f, false);
		addAttackText(id2 + 13, text3, tda, 0, 0xff981f, false);
		addAttackText(id2 + 14, text4, tda, 0, 0xff981f, false);

		rsi.specialBar(id3, tda); // 7599

		addAttackHover(id2 + 3, hoverID1, popupString1, tda);
		addAttackHover(id2 + 6, hoverID2, popupString2, tda);
		addAttackHover(id2 + 5, hoverID3, popupString3, tda);
		addAttackHover(id2 + 4, hoverID4, popupString4, tda);

		rsi.width = 190;
		rsi.height = 261;

		int frame = 0;
		rsi.totalChildren(20);

		rsi.child(frame, id2 + 3, 21, 46);
		frame++; // 2429
		rsi.child(frame, id2 + 4, 104, 99);
		frame++; // 2430
		rsi.child(frame, id2 + 5, 21, 99);
		frame++; // 2431
		rsi.child(frame, id2 + 6, 105, 46);
		frame++; // 2432

		rsi.child(frame, id2 + 7, img1x, img1y);
		frame++; // bottomright 2433
		rsi.child(frame, id2 + 8, img2x, img2y);
		frame++; // topleft 2434
		rsi.child(frame, id2 + 9, img3x, img3y);
		frame++; // bottomleft 2435
		rsi.child(frame, id2 + 10, img4x, img4y);
		frame++; // topright 2436

		rsi.child(frame, id2 + 11, str1x, str1y);
		frame++; // chop 2437
		rsi.child(frame, id2 + 12, str2x, str2y);
		frame++; // slash 2438
		rsi.child(frame, id2 + 13, str3x, str3y);
		frame++; // lunge 2439
		rsi.child(frame, id2 + 14, str4x, str4y);
		frame++; // block 2440

		rsi.child(frame, id3, 21, 205);
		frame++; // special attack 7599
		rsi.child(frame, 19300, 0, 0);
		frame++; // stuffs
		rsi.child(frame, id2, 94, 4);
		frame++; // weapon 2426
		rsi.child(frame, hoverID1, 25, 96);
		frame++;
		rsi.child(frame, hoverID2, 108, 96);
		frame++;
		rsi.child(frame, hoverID3, 25, 149);
		frame++;
		rsi.child(frame, hoverID4, 108, 149);
		frame++;
		rsi.child(frame, 40005, 28, 149);
		frame++; // special bar tooltip

		for (int i = id2 + 3; i < id2 + 7; i++) { // 2429 - 2433
			rsi = interfaceCache[i];
			rsi.sprite1 = CustomSpriteLoader(19301, "");
			rsi.sprite2 = CustomSpriteLoader(19301, "a");
			rsi.width = 68;
			rsi.height = 44;
		}
	}

	public static void Sidebar0b(int id, int id2, String text1, String text2,
			String text3, String text4, int str1x, int str1y, int str2x,
			int str2y, int str3x, int str3y, int str4x, int str4y, int img1x,
			int img1y, int img2x, int img2y, int img3x, int img3y, int img4x,
			int img4y, TextDrawingArea[] tda, String popupString1,
			String popupString2, String popupString3, String popupString4,
			int hoverID1, int hoverID2, int hoverID3, int hoverID4) // 4button
																	// nospec
	{
		RSInterface rsi = addTabInterface(id); // 2423
		addAttackText(id2, "-2", tda, 3, 0xff981f, true); // 2426
		addAttackText(id2 + 11, text1, tda, 0, 0xff981f, false);
		addAttackText(id2 + 12, text2, tda, 0, 0xff981f, false);
		addAttackText(id2 + 13, text3, tda, 0, 0xff981f, false);
		addAttackText(id2 + 14, text4, tda, 0, 0xff981f, false);

		addAttackHover(id2 + 3, hoverID1, popupString1, tda);
		addAttackHover(id2 + 6, hoverID2, popupString2, tda);
		addAttackHover(id2 + 5, hoverID3, popupString3, tda);
		addAttackHover(id2 + 4, hoverID4, popupString4, tda);

		rsi.width = 190;
		rsi.height = 261;

		int frame = 0;
		rsi.totalChildren(18);

		rsi.child(frame, id2 + 3, 21, 46);
		frame++; // 2429
		rsi.child(frame, id2 + 4, 104, 99);
		frame++; // 2430
		rsi.child(frame, id2 + 5, 21, 99);
		frame++; // 2431
		rsi.child(frame, id2 + 6, 105, 46);
		frame++; // 2432

		rsi.child(frame, id2 + 7, img1x, img1y);
		frame++; // bottomright 2433
		rsi.child(frame, id2 + 8, img2x, img2y);
		frame++; // topleft 2434
		rsi.child(frame, id2 + 9, img3x, img3y);
		frame++; // bottomleft 2435
		rsi.child(frame, id2 + 10, img4x, img4y);
		frame++; // topright 2436

		rsi.child(frame, id2 + 11, str1x, str1y);
		frame++; // chop 2437
		rsi.child(frame, id2 + 12, str2x, str2y);
		frame++; // slash 2438
		rsi.child(frame, id2 + 13, str3x, str3y);
		frame++; // lunge 2439
		rsi.child(frame, id2 + 14, str4x, str4y);
		frame++; // block 2440

		rsi.child(frame, 19300, 0, 0);
		frame++; // stuffs
		rsi.child(frame, id2, 94, 4);
		frame++; // weapon 2426
		rsi.child(frame, hoverID1, 25, 96);
		frame++;
		rsi.child(frame, hoverID2, 108, 96);
		frame++;
		rsi.child(frame, hoverID3, 25, 149);
		frame++;
		rsi.child(frame, hoverID4, 108, 149);
		frame++;

		for (int i = id2 + 3; i < id2 + 7; i++) { // 2429 - 2433
			rsi = interfaceCache[i];
			rsi.sprite1 = CustomSpriteLoader(19301, "");
			rsi.sprite2 = CustomSpriteLoader(19301, "a");
			rsi.width = 68;
			rsi.height = 44;
		}
	}

	public static void Sidebar0c(int id, int id2, int id3, String text1,
			String text2, String text3, int str1x, int str1y, int str2x,
			int str2y, int str3x, int str3y, int img1x, int img1y, int img2x,
			int img2y, int img3x, int img3y, TextDrawingArea[] tda,
			String popupString1, String popupString2, String popupString3,
			int hoverID1, int hoverID2, int hoverID3) // 3button spec
	{
		RSInterface rsi = addTabInterface(id); // 2423
		addAttackText(id2, "-2", tda, 3, 0xff981f, true); // 2426
		addAttackText(id2 + 9, text1, tda, 0, 0xff981f, false);
		addAttackText(id2 + 10, text2, tda, 0, 0xff981f, false);
		addAttackText(id2 + 11, text3, tda, 0, 0xff981f, false);

		rsi.specialBar(id3, tda); // 7599

		addAttackHover(id2 + 5, hoverID1, popupString1, tda);
		addAttackHover(id2 + 4, hoverID2, popupString2, tda);
		addAttackHover(id2 + 3, hoverID3, popupString3, tda);

		rsi.width = 190;
		rsi.height = 261;

		int frame = 0;
		rsi.totalChildren(16);

		rsi.child(frame, id2 + 3, 21, 99);
		frame++;
		rsi.child(frame, id2 + 4, 105, 46);
		frame++;
		rsi.child(frame, id2 + 5, 21, 46);
		frame++;

		rsi.child(frame, id2 + 6, img1x, img1y);
		frame++; // topleft
		rsi.child(frame, id2 + 7, img2x, img2y);
		frame++; // bottomleft
		rsi.child(frame, id2 + 8, img3x, img3y);
		frame++; // topright

		rsi.child(frame, id2 + 9, str1x, str1y);
		frame++; // chop
		rsi.child(frame, id2 + 10, str2x, str2y);
		frame++; // slash
		rsi.child(frame, id2 + 11, str3x, str3y);
		frame++; // lunge

		rsi.child(frame, id3, 21, 205);
		frame++; // special attack 7599
		rsi.child(frame, 19300, 0, 0);
		frame++; // stuffs
		rsi.child(frame, id2, 94, 4);
		frame++; // weapon

		rsi.child(frame, hoverID1, 25, 96);
		frame++;
		rsi.child(frame, hoverID2, 108, 96);
		frame++;
		rsi.child(frame, hoverID3, 25, 149);
		frame++;
		rsi.child(frame, 40005, 28, 149);
		frame++; // special bar tooltip

		for (int i = id2 + 3; i < id2 + 6; i++) {
			rsi = interfaceCache[i];
			rsi.sprite1 = CustomSpriteLoader(19301, "");
			rsi.sprite2 = CustomSpriteLoader(19301, "a");
			rsi.width = 68;
			rsi.height = 44;
		}
	}

	public static void Sidebar0d(int id, int id2, String text1, String text2,
			String text3, int str1x, int str1y, int str2x, int str2y,
			int str3x, int str3y, int img1x, int img1y, int img2x, int img2y,
			int img3x, int img3y, TextDrawingArea[] tda) // 3button nospec
															// (magic intf)
	{
		RSInterface rsi = addTabInterface(id); // 2423
		addAttackText(id2, "-2", tda, 3, 0xff981f, true); // 2426
		addAttackText(id2 + 9, text1, tda, 0, 0xff981f, false);
		addAttackText(id2 + 10, text2, tda, 0, 0xff981f, false);
		addAttackText(id2 + 11, text3, tda, 0, 0xff981f, false);

		addAttackText(353, "Spell", tda, 0, 0xff981f, false);
		addAttackText(354, "Spell", tda, 0, 0xff981f, false);

		addCacheSprite(337, 19, 0, "combaticons");
		addCacheSprite(338, 13, 0, "combaticons2");
		addCacheSprite(339, 14, 0, "combaticons2");

		addToggleButton(349, 349, 108, 68, 44, "Select");
		addToggleButton(350, 350, 108, 68, 44, "Select");

		rsi.width = 190;
		rsi.height = 261;

		int last = 15;
		int frame = 0;
		rsi.totalChildren(last);

		rsi.child(frame, id2 + 3, 20, 115);
		frame++;
		rsi.child(frame, id2 + 4, 20, 80);
		frame++;
		rsi.child(frame, id2 + 5, 20, 45);
		frame++;

		rsi.child(frame, id2 + 6, img1x, img1y);
		frame++; // topleft
		rsi.child(frame, id2 + 7, img2x, img2y);
		frame++; // bottomleft
		rsi.child(frame, id2 + 8, img3x, img3y);
		frame++; // topright

		rsi.child(frame, id2 + 9, str1x, str1y);
		frame++; // bash
		rsi.child(frame, id2 + 10, str2x, str2y);
		frame++; // pound
		rsi.child(frame, id2 + 11, str3x, str3y);
		frame++; // focus

		rsi.child(frame, 349, 105, 46);
		frame++; // spell1
		rsi.child(frame, 350, 104, 106);
		frame++; // spell2

		rsi.child(frame, 353, 125, 74);
		frame++; // spell
		rsi.child(frame, 354, 125, 134);
		frame++; // spell

		rsi.child(frame, 19300, 0, 0);
		frame++; // stuffs
		rsi.child(frame, id2, 94, 4);
		frame++; // weapon
	}

	public static void prayerTab(TextDrawingArea[] tda) {
		RSInterface tab = addTabInterface(5608);
		RSInterface currentPray = interfaceCache[687];
		addSprite(5651, 0, "Prayer/PRAYER");
		currentPray.textColor = 0xFF981F;
		currentPray.textShadow = true;
		currentPray.message = "%1/%2";

		int[] ID1 = { 18016, 18017, 18018, 18019, 18020, 18021, 18022, 18023,
				18024, 18025, 18026, 18027, 18028, 18029, 18030, 18031, 18032,
				18033, 18034, 18035, 18036, 18037, 18038, 18039, 18040, 18041 };
		int[] X = { 8, 44, 80, 114, 150, 8, 44, 80, 116, 152, 8, 42, 78, 116,
				152, 8, 44, 80, 116, 150, 6, 44, 80, 116, 150, 6 };
		int[] Y = { 6, 6, 6, 4, 4, 42, 42, 42, 42, 42, 79, 76, 76, 78, 78, 114,
				114, 114, 114, 112, 148, 150, 150, 150, 148, 184 };

		int[] hoverIDs = { 18050, 18052, 18054, 18056, 18058, 18060, 18062,
				18064, 18066, 18068, 18070, 18072, 18074, 18076, 18078, 18080,
				18082, 18084, 18086, 18088, 18090, 18092, 18094, 18096, 18098,
				18100 };
		int[] hoverX = { 12, 8, 20, 12, 24, 2, 2, 6, 6, 50, 6, 6, 10, 6, 6, 5,
				5, 5, 5, 5, 18, 28, 28, 50, 1, 1 };
		int[] hoverY = { 42, 42, 42, 42, 42, 80, 80, 80, 80, 80, 118, 118, 118,
				118, 118, 150, 150, 150, 150, 150, 105, 80, 65, 65, 65, 110 };
		String[] hoverStrings = {
				"Level 01\nThick Skin\nIncreases your Defence by 5%",
				"Level 04\nBurst of Strength\nIncreases your Strength by 5%",
				"Level 07\nCharity of Thought\nIncreases your Attack by 5%",
				"Level 08\nSharp Eye\nIncreases your Ranged by 5%",
				"Level 09\nMystic Will\nIncreases your Magic by 5%",
				"Level 10\nRock Skin\nIncreases your Defence by 10%",
				"Level 13\nSuperhuman Strength\nIncreases your Strength by 10%",
				"Level 16\nImproved Reflexes\nIncreases your Attack by 10%",
				"Level 19\nRapid Restore\n2x restore rate for all stats\nexcept Hitpoints and Prayer",
				"Level 22\nRapid Heal\n2x restore rate for the\nHitpoints stat",
				"Level 25\nProtect Item\nKeep one extra item if you die",
				"Level 26\nHawk Eye\nIncreases your Ranged by 10%",
				"Level 27\nMystic Lore\nIncreases your Magic by 10%",
				"Level 28\nSteel Skin\nIncreases your Defence by 15%",
				"Level 31\nUltimate Strength\nIncreases your Strength by 15%",
				"Level 34\nIncredible Reflexes\nIncreases your Attack by 15%",
				"Level 37\nProtect from Magic\nProtection from magical attacks",
				"Level 40\nProtect from Missiles\nProtection from ranged attacks",
				"Level 43\nProtect from Melee\nProtection from close attacks",
				"Level 44\nEagle Eye\nIncreases your Ranged by 15%",
				"Level 45\nMystic Might\nIncreases your Magic by 15%",
				"Level 46\nRetribution\nInflicts damage to nearby\ntargets if you die",
				"Level 49\nRedemption\nHeals you when damaged\nand Hitpoints falls\nbelow 10%",
				"Level 52\nSmite\n1/4 of damage dealt is\nalso removed from\nopponents Prayer",
				"Level 60\nChivalry\nIncreases your Defence by 20%,\nStrength by 18% and Attack by\n15%",
				"Level 70\nPiety\nIncreases your Defence by 25%,\nStrength by 23% and Attack by\n20%" };

		int ID2[] = { 5609, 5610, 5611, 5612, 5613, 5614, 5615, 5616, 5617,
				5618, 5619, 5620, 5621, 5622, 5623, 683, 684, 685, 5632, 5633,
				5634, 5635, 5636, 5637, 5638, 5639, 5640, 5641, 5642, 5643,
				5644, 686, 5645, 5649, 5647, 5648, 18000, 18001, 18002, 18003,
				18004, 18005, 18006, 18007, 18008, 18009, 18010, 18011, 18012,
				18013, 18014, 18015, 5651, 687 };
		int X2[] = { 6, 42, 78, 6, 42, 78, 114, 150, 6, 114, 150, 6, 42, 78,
				114, 42, 78, 114, 8, 44, 80, 8, 44, 80, 116, 152, 8, 116, 152,
				8, 44, 80, 116, 44, 80, 116, 114, 117, 150, 153, 42, 45, 78,
				81, 150, 153, 6, 9, 150, 157, 6, 8, 65, 14 };
		int Y2[] = { 4, 4, 4, 40, 40, 40, 40, 40, 76, 76, 76, 112, 112, 112,
				112, 148, 148, 148, 6, 6, 6, 42, 42, 42, 42, 42, 79, 78, 78,
				114, 114, 114, 114, 150, 150, 150, 4, 8, 4, 7, 76, 80, 76, 79,
				112, 116, 148, 151, 148, 151, 184, 194, 242, 244 };

		String[] oldPrayerNames = { "Thick Skin", "Burst of Strength",
				"Charity of Thought", "Rock Skin", "Superhuman Strength",
				"Improved Reflexes", "Rapid Restore", "Rapid Heal",
				"Protect Item", "Steel Skin", "Ultimate Strength",
				"Incredible Reflexes", "Protect from Magic",
				"Protect from Missiles", "Protect from Melee", "Retribution",
				"Redemption", "Smite" };
		addPrayer(18000, 0, 601, 7, 0, "Sharp Eye");
		addPrayer(18002, 0, 602, 8, 1, "Mystic Will");
		addPrayer(18004, 0, 603, 25, 2, "Hawk Eye");
		addPrayer(18006, 0, 604, 26, 3, "Mystic Lore");
		addPrayer(18008, 0, 605, 43, 4, "Eagle Eye");
		addPrayer(18010, 0, 606, 44, 5, "Mystic Might");
		addPrayer(18012, 0, 607, 59, 6, "Chivalry");
		addPrayer(18014, 0, 608, 69, 7, "Piety");

		for (int i = 0; i < 18; i++) {
			addOldPrayer(ID2[i], oldPrayerNames[i]);
		}

		for (int i = 0; i < 26; i++) {
			addPrayerHover(ID1[i], hoverIDs[i], i, hoverStrings[i]);
		}

		tab.totalChildren(106); // 54
		tab.child(52, 5651, 70, 242);
		for (int ii = 0; ii < 54; ii++) {
			tab.child(ii, ID2[ii], X2[ii], Y2[ii]);
		}

		int frame = 54;
		int frame2 = 0;
		for (int i : ID1) {
			tab.child(frame, i, X[frame2], Y[frame2]);
			frame++;
			frame2++;
		}

		int frame3 = 0;
		for (int i : hoverIDs) {
			tab.child(frame, i, hoverX[frame3], hoverY[frame3]);
			frame++;
			frame3++;
		}
	}

	public static void magicTab(TextDrawingArea[] tda) {
		RSInterface tab = addTabInterface(1151);
		RSInterface homeHover = addTabInterface(1196);
		RSInterface spellButtons = interfaceCache[12424];
		spellButtons.scrollMax = 0;
		spellButtons.height = 260;
		spellButtons.width = 190;
		int[] spellButton = { 1196, 1199, 1206, 1215, 1224, 1231, 1240, 1249,
				1258, 1267, 1274, 1283, 1573, 1290, 1299, 1308, 1315, 1324,
				1333, 1340, 1349, 1358, 1367, 1374, 1381, 1388, 1397, 1404,
				1583, 12038, 1414, 1421, 1430, 1437, 1446, 1453, 1460, 1469,
				15878, 1602, 1613, 1624, 7456, 1478, 1485, 1494, 1503, 1512,
				1521, 1530, 1544, 1553, 1563, 1593, 1635, 12426, 12436, 12446,
				12456, 6004, 18471 };
		tab.totalChildren(63);
		tab.child(0, 12424, 13, 24);
		for (int i1 = 0; i1 < spellButton.length; i1++) {
			int yPos = i1 > 34 ? 8 : 183;
			tab.child(1, 1195, 13, 24);
			tab.child(i1 + 2, spellButton[i1], 5, yPos);
			addButton(1195, 1, "Magic/Home", "Cast @gre@Home Teleport");
			RSInterface homeButton = interfaceCache[1195];
			homeButton.mOverInterToTrigger = 1196;
		}
		for (int i2 = 0; i2 < spellButton.length; i2++) {
			if (i2 < 60)
				spellButtons.childX[i2] = spellButtons.childX[i2] + 24;
			if (i2 == 6 || i2 == 12 || i2 == 19 || i2 == 35 || i2 == 41
					|| i2 == 44 || i2 == 49 || i2 == 51)
				spellButtons.childX[i2] = 0;
			spellButtons.childY[6] = 24;
			spellButtons.childY[12] = 48;
			spellButtons.childY[19] = 72;
			spellButtons.childY[49] = 96;
			spellButtons.childY[44] = 120;
			spellButtons.childY[51] = 144;
			spellButtons.childY[35] = 170;
			spellButtons.childY[41] = 192;
		}
		homeHover.isMouseoverTriggered = true;
		addText(1197, "Level 0: Home Teleport", tda, 1, 0xFE981F, true, true);
		RSInterface homeLevel = interfaceCache[1197];
		homeLevel.width = 174;
		homeLevel.height = 68;
		addText(1198, "A teleport which requires no", tda, 0, 0xAF6A1A, true,
				true);
		addText(18998, "runes and no required level that", tda, 0, 0xAF6A1A,
				true, true);
		addText(18999, "teleports you to the main land.", tda, 0, 0xAF6A1A,
				true, true);
		homeHover.totalChildren(4);
		homeHover.child(0, 1197, 3, 4);
		homeHover.child(1, 1198, 91, 23);
		homeHover.child(2, 18998, 91, 34);
		homeHover.child(3, 18999, 91, 45);
	}

	public static void ancientMagicTab(TextDrawingArea[] tda) {
		RSInterface tab = addInterface(12855);
		addButton(12856, 1, "Magic/Home", "Cast @gre@Home Teleport");
		RSInterface homeButton = interfaceCache[12856];
		homeButton.mOverInterToTrigger = 1196;
		int[] itfChildren = { 12856, 12939, 12987, 13035, 12901, 12861, 13045,
				12963, 13011, 13053, 12919, 12881, 13061, 12951, 12999, 13069,
				12911, 12871, 13079, 12975, 13023, 13087, 12929, 12891, 13095,
				1196, 12940, 12988, 13036, 12902, 12862, 13046, 12964, 13012,
				13054, 12920, 12882, 13062, 12952, 13000, 13070, 12912, 12872,
				13080, 12976, 13024, 13088, 12930, 12892, 13096 };
		tab.totalChildren(itfChildren.length);
		for (int i1 = 0, xPos = 18, yPos = 8; i1 < itfChildren.length; i1++, xPos += 45) {
			if (xPos > 175) {
				xPos = 18;
				yPos += 28;
			}
			if (i1 < 25)
				tab.child(i1, itfChildren[i1], xPos, yPos);
			if (i1 > 24) {
				yPos = i1 < 41 ? 181 : 1;
				tab.child(i1, itfChildren[i1], 4, yPos);
			}
		}
	}

	public static void clanChatTab(TextDrawingArea[] tda) {
		RSInterface tab = addTabInterface(18128);
		addHoverButton(18129, "/Clan Chat/SPRITE", 6, 72, 32, "Join Clan", 550,
				18130, 5);
		addHoveredButton(18130, "/Clan Chat/SPRITE", 7, 72, 32, 18131);
		addHoverButton(18132, "/Clan Chat/SPRITE", 6, 72, 32, "Clan Setup", -1,
				18133, 5);
		addHoveredButton(18133, "/Clan Chat/SPRITE", 7, 72, 32, 18134);
		addText(18135, "Join Clan", tda, 0, 0xff9b00, true, true);
		addText(18136, "Clan Setup", tda, 0, 0xff9b00, true, true);
		addSprite(18137, 37, "/Clan Chat/SPRITE");
		addText(18138, "Clan Chat", tda, 1, 0xff9b00, true, true);
		addText(18139, "Talking in: Not in clan", tda, 0, 0xff9b00, false, true);
		addText(18140, "Owner: None", tda, 0, 0xff9b00, false, true);
		addSprite(16126, 4, "/Clan Chat/SPRITE");
		tab.totalChildren(13);
		tab.child(0, 16126, 0, 221);
		tab.child(1, 16126, 0, 59);
		tab.child(2, 18137, 0, 62);
		tab.child(3, 18143, 0, 62);
		tab.child(4, 18129, 15, 226);
		tab.child(5, 18130, 15, 226);
		tab.child(6, 18132, 103, 226);
		tab.child(7, 18133, 103, 226);
		tab.child(8, 18135, 51, 237);
		tab.child(9, 18136, 139, 237);
		tab.child(10, 18138, 95, 1);
		tab.child(11, 18139, 10, 23);
		tab.child(12, 18140, 25, 38);
		/* Text area */
		RSInterface list = addTabInterface(18143);
		list.totalChildren(100);
		for (int i = 18144; i <= 18244; i++) {
			addText(i, "", tda, 0, 0xffffff, false, true);
		}
		for (int id = 18144, i = 0; id <= 18243 && i <= 99; id++, i++) {
			interfaceCache[id].actions = new String[] { "Edit Rank", "Kick",
					"Ban" };
			list.children[i] = id;
			list.childX[i] = 5;
			for (int id2 = 18144, i2 = 1; id2 <= 18243 && i2 <= 99; id2++, i2++) {
				list.childY[0] = 2;
				list.childY[i2] = list.childY[i2 - 1] + 14;
			}
		}
		list.height = 158;
		list.width = 174;
		list.scrollMax = 1405;
	}
}