package gui;
public class CompleteRun {
	static void populateData(){
		populateNotepad();
		populateMdb();
		populateSql();
	}
	static void populateNotepad(){
		forNotepad.GiveNotepad.main(null);	
	}
	static void populateMdb(){
		mdbTomdb.GiveMdbFromNotepad.main(null);
		mdbTomdb.PutMdb.main(null);//i think i forgot the PutMdb class. replaced it for now
		//check again later
	}
	static void populateSql(){
		mysqlToMdb.PopulateList.main(null);
		mysqlToMdb.EnterSql.main(null);
	}
	static void extractData(){
		extractNotepad();
		extractMdb();
		extractSql();	
	}
	static void extractNotepad(){
		forNotepad.TakeNote.main(null);
	}
	static void extractMdb(){
		mdbTomdb.MdbTransfer.main(null);	
	}
	static void extractSql(){
		mysqlToMdb.Transfer.main(null);
	}
	static void finalTransfer(){
		finalTransferToWarehouse.Transfer.doStuff();
		mdbTomdb.TrialDelete.main(null);
	}
}

