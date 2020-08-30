public class SortNegativeDataType extends SortData {

    public SortNegativeDataType() {
        this.dataSource = new ReadData();
        this.sortAction = new SortX();
        this.sort();
    }
}
