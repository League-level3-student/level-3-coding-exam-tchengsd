import java.util.ArrayList;

public class VoteProcessor {
	String calculateElectionWinner(ArrayList<String> votes) {
		int votesP = 0;
		int votesE = 0;
		for(int i = 0; i < votes.size(); i++) {
			if(votes.get(i).equalsIgnoreCase("pope francis")) {
				votesP++;
			} else if(votes.get(i).equalsIgnoreCase("edward snowden")) {
				votesE++;
			}
		}
		if(votesP > votesE) {
			return "pope francis";
		} else if (votesE > votesP) {
			return "edward snowden";
		} else if (votesP == votesE) {
			return "TIE";
		}
		return "";
	}
}
