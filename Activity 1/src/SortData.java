public abstract class SortData {

    SortAction sortAction;
    ReadData dataSource;

    public SortData() {
    }

    public void setSortAction(SortAction sortAction) {
        this.sortAction = sortAction;
    }

    public void setDataSource(ReadData dataSource) {
        this.dataSource = dataSource;
    }

    public void sort() {
        this.sortAction.sort(dataSource.data);
    }
}
