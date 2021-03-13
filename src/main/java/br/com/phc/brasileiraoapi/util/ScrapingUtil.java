package br.com.phc.brasileiraoapi.util;

import br.com.phc.brasileiraoapi.dto.PartidaGoogleDTO;

public class ScrapingUtil {

	private static final String BASE_URL_GOOGLE = "https://www.google.com/search?=";
	private static final String COMPLEMENTO_URL_GOOGLE = "&hl=pt-BR";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PartidaGoogleDTO partida = new PartidaGoogleDTO();
		partida.getGolsEquipeCasa();
	}

}
