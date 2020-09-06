package br.ce.wcaquino.matchers;

import java.util.Calendar;

public class MatchersProprios {

	public static DiaSemanaMatcher caiEm(Integer diaSemana) {
		return new DiaSemanaMatcher(diaSemana);
	}

	public static DiaSemanaMatcher caiNumaSegunda() {
		return new DiaSemanaMatcher(Calendar.MONDAY);
	}

	public static DataDiferencadiasMetcher ehHojeComDiferencaDias(Integer qtdDias) {
		return new DataDiferencadiasMetcher(qtdDias);
	}

	public static DataDiferencadiasMetcher ehHoje() {
		return new DataDiferencadiasMetcher(0);
	}
}
