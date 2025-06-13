<asp:GridView ID="GridView1" runat="server" AutoGenerateColumns="false" 
              OnRowCreated="GridView1_RowCreated"
              CssClass="table table-bordered">
    <Columns>
        <asp:BoundField DataField="Jan2024" HeaderText="Jan" />
        <asp:BoundField DataField="Feb2024" HeaderText="Feb" />
        <asp:BoundField DataField="Mar2024" HeaderText="Mar" />
        <asp:BoundField DataField="Jan2025" HeaderText="Jan" />
        <asp:BoundField DataField="Feb2025" HeaderText="Feb" />
        <asp:BoundField DataField="Mar2025" HeaderText="Mar" />
    </Columns>
</asp:GridView>

protected void GridView1_RowCreated(object sender, GridViewRowEventArgs e)
{
    if (e.Row.RowType == DataControlRowType.Header)
    {
        GridViewRow headerRow = new GridViewRow(0, 0, DataControlRowType.Header, DataControlRowState.Insert);

        headerRow.Cells.Add(new TableHeaderCell { Text = "2024", ColumnSpan = 3, HorizontalAlign = HorizontalAlign.Center });
        headerRow.Cells.Add(new TableHeaderCell { Text = "2025", ColumnSpan = 3, HorizontalAlign = HorizontalAlign.Center });

        GridView1.Controls[0].Controls.AddAt(0, headerRow); // Add above default header
    }
}
