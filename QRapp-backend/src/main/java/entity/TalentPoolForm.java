package entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;

@Entity
public class TalentPoolForm {
	
		private String naam;
		
		private String emailAdres;
		
		private int telefoonNummer;
		
		private String studieNaam;
		
		private LocalDate afstudeerDatum;
		
		private String woonplaats;
		
		private String contactPersoonWT;
		
		private boolean akkoordDataOpslaan;
		
		private boolean NieuwsBericht;

		public String getNaam() {
			return naam;
		}

		public void setNaam(String naam) {
			this.naam = naam;
		}

		public String getEmailAdres() {
			return emailAdres;
		}

		public void setEmailAdres(String emailAdres) {
			this.emailAdres = emailAdres;
		}

		public int getTelefoonNummer() {
			return telefoonNummer;
		}

		public void setTelefoonNummer(int telefoonNummer) {
			this.telefoonNummer = telefoonNummer;
		}

		public String getStudieNaam() {
			return studieNaam;
		}

		public void setStudieNaam(String studieNaam) {
			this.studieNaam = studieNaam;
		}

		public LocalDate getAfstudeerDatum() {
			return afstudeerDatum;
		}

		public void setAfstudeerDatum(LocalDate afstudeerDatum) {
			this.afstudeerDatum = afstudeerDatum;
		}

		public String getWoonplaats() {
			return woonplaats;
		}

		public void setWoonplaats(String woonplaats) {
			this.woonplaats = woonplaats;
		}

		public String getContactPersoonWT() {
			return contactPersoonWT;
		}

		public void setContactPersoonWT(String contactPersoonWT) {
			this.contactPersoonWT = contactPersoonWT;
		}

		public boolean isAkkoordDataOpslaan() {
			return akkoordDataOpslaan;
		}

		public void setAkkoordDataOpslaan(boolean akkoordDataOpslaan) {
			this.akkoordDataOpslaan = akkoordDataOpslaan;
		}

		public boolean isNieuwsBericht() {
			return NieuwsBericht;
		}

		public void setNieuwsBericht(boolean nieuwsBericht) {
			NieuwsBericht = nieuwsBericht;
		}
		
		
		
		

}
