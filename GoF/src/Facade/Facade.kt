package Facade

class Facade { // Ex Spring

	var filter: SubSystemFilter;
	var controller: SubSystemController;
	var service: SubSystemService;

	constructor() {
		filter = SubSystemFilter();
		controller = SubSystemController();
		service = SubSystemService();
	}

	fun restapi(request: String): Int {
		if (filter.xssAttack(request)) {
			return 500;
		}

		val code: Int = controller.check(request);
		if (code != 200) {
			return code;
		}

		val res: String = service.dataReturn(request);

		if (res == "exception") {
			return 500;
		}
		return 200;
	}
}

class SubSystemFilter {
	fun xssAttack(str: String): Boolean {
		if ("xss" == str) { // equals
			return true;
		} else {
			return false;
		}
	}
}

class SubSystemController {
	fun check(str: String): Int {
		if (str == "forbidden") {
			return 403;
		} else if (str == "unauthorized") {
			return 401;
		} else {
			return 200;
		}
	}
}

class SubSystemService {
	var dao: SubSystemDao;

	constructor() {
		dao = SubSystemDao();
	}

	fun dataReturn(str: String): String {
		return dao.sql(str);
	}
}

class SubSystemDao {
	fun sql(str: String): String {
		if ("injection" == str) { // equals
			return "exception";
		} else {
			return "Vo";
		}
	}
}