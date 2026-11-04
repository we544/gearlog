I see - you are in that folder, button is hidden. Use this trick - *type URL directly:*

On your laptop, click address bar and go to this link:
https://github.com/we544/gearlog/new/main/src/main/java/zm/gearlog
That will open *Create new file* page directly inside `App.java` folder.

Then:
1. Top where it says `Name your file...` type: `LendingRequest.java`
2. In big box, paste this code:
package zm.gearlog;

public class LendingRequest {
    private Long equipmentId;
    private Long borrowerId;
    private int days;

    public LendingRequest() {}

    public LendingRequest(Long equipmentId, Long borrowerId, int days) {
        this.equipmentId = equipmentId;
        this.borrowerId = borrowerId;
        this.days = days;
    }

    public Long getEquipmentId() { return equipmentId; }
    public void setEquipmentId(Long equipmentId) { this.equipmentId = equipmentId; }
    public Long getBorrowerId() { return borrowerId; }
    public void setBorrowerId(Long borrowerId) { this.borrowerId = borrowerId; }
    public int getDays() { return days; }
    public void setDays(int days) { this.days = days; }
}
3. Click green *Commit changes*

That's it. Try that link now - it will work even without Add file button.
