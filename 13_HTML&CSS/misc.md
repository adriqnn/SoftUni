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
