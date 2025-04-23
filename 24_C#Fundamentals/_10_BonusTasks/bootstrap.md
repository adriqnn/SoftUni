<div class="container">
            <!-- Row 1 -->
            <div class="button-row">
                <asp:Button runat="server" ID="Button1" Text="Button 1" CssClass="btn btn-primary" />
                <asp:Button runat="server" ID="Button2" Text="Button 2" CssClass="btn btn-primary" />
            </div>
            <!-- Row 2 -->
            <div class="button-row">
                <asp:Button runat="server" ID="Button3" Text="Button 3" CssClass="btn btn-primary" />
                <asp:Button runat="server" ID="Button4" Text="Button 4" CssClass="btn btn-primary" />
            </div>
            <!-- Row 3 -->
            <div class="button-row">
                <asp:Button runat="server" ID="Button5" Text="Button 5" CssClass="btn btn-primary" />
                <asp:Button runat="server" ID="Button6" Text="Button 6" CssClass="btn btn-primary" />
            </div>
            <!-- Row 4 -->
            <div class="button-row">
                <asp:Button runat="server" ID="Button7" Text="Button 7" CssClass="btn btn-primary" />
                <asp:Button runat="server" ID="Button8" Text="Button 8" CssClass="btn btn-primary" />
            </div>
            <!-- Row 5 -->
            <div class="button-row">
                <asp:Button runat="server" ID="Button9" Text="Button 9" CssClass="btn btn-primary" />
                <asp:Button runat="server" ID="Button10" Text="Button 10" CssClass="btn btn-primary" />
            </div>
            <!-- Row 6 -->
            <div class="button-row">
                <asp:Button runat="server" ID="Button11" Text="Button 11" CssClass="btn btn-primary" />
                <asp:Button runat="server" ID="Button12" Text="Button 12" CssClass="btn btn-primary" />
            </div>
            <!-- Row 7 -->
            <div class="button-row">
                <asp:Button runat="server" ID="Button13" Text="Button 13" CssClass="btn btn-primary" />
                <asp:Button runat="server" ID="Button14" Text="Button 14" CssClass="btn btn-primary" />
            </div>
            <!-- Row 8 -->
            <div class="button-row">
                <asp:Button runat="server" ID="Button15" Text="Button 15" CssClass="btn btn-primary" />
                <asp:Button runat="server" ID="Button16" Text="Button 16" CssClass="btn btn-primary" />
            </div>
            <!-- Row 9 -->
            <div class="button-row">
                <asp:Button runat="server" ID="Button17" Text="Button 17" CssClass="btn btn-primary" />
                <asp:Button runat="server" ID="Button18" Text="Button 18" CssClass="btn btn-primary" />
            </div>
            <!-- Row 10 -->
            <div class="button-row">
                <asp:Button runat="server" ID="Button19" Text="Button 19" CssClass="btn btn-primary" />
                <asp:Button runat="server" ID="Button20" Text="Button 20" CssClass="btn btn-primary" />
            </div>
            <!-- Row 11 -->
            <div class="button-row">
                <asp:Button runat="server" ID="Button21" Text="Button 21" CssClass="btn btn-primary" />
                <asp:Button runat="server" ID="Button22" Text="Button 22" CssClass="btn btn-primary" />
            </div>
            <!-- Row 12 -->
            <div class="button-row">
                <asp:Button runat="server" ID="Button23" Text="Button 23" CssClass="btn btn-primary" />
                <asp:Button runat="server" ID="Button24" Text="Button 24" CssClass="btn btn-primary" />
            </div>
        </div>

body {
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
            margin: 0;
        }

        /* Styling for the container to hold the buttons */
        .container {
            display: grid;
            grid-template-columns: 1fr 1fr; /* 2 columns */
            gap: 10px; /* Gap between buttons */
        }

        /* Each button should be at least 200px wide */
        .btn {
            width: 200px;
        }

        /* Centering buttons within their container */
        .button-row {
            display: flex;
            justify-content: space-between;
        }


<asp:Button runat="server" ID="Button1" Text="Button 1" CssClass="btn btn-primary" />
            <asp:Button runat="server" ID="Button2" Text="Button 2" CssClass="btn btn-primary" />
            <asp:Button runat="server" ID="Button3" Text="Button 3" CssClass="btn btn-primary" />
            <asp:Button runat="server" ID="Button4" Text="Button 4" CssClass="btn btn-primary" />
            <asp:Button runat="server" ID="Button5" Text="Button 5" CssClass="btn btn-primary" />
            <asp:Button runat="server" ID="Button6" Text="Button 6" CssClass="btn btn-primary" />
            <asp:Button runat="server" ID="Button7" Text="Button 7" CssClass="btn btn-primary" />
            <asp:Button runat="server" ID="Button8" Text="Button 8" CssClass="btn btn-primary" />
            <asp:Button runat="server" ID="Button9" Text="Button 9" CssClass="btn btn-primary" />
            <asp:Button runat="server" ID="Button10" Text="Button 10" CssClass="btn btn-primary" />
            <asp:Button runat="server" ID="Button11" Text="Button 11" CssClass="btn btn-primary" />
            <asp:Button runat="server" ID="Button12" Text="Button 12" CssClass="btn btn-primary" />

            <!-- Second Column (12 rows) -->
            <asp:Button runat="server" ID="Button13" Text="Button 13" CssClass="btn btn-primary" />
            <asp:Button runat="server" ID="Button14" Text="Button 14" CssClass="btn btn-primary" />
            <asp:Button runat="server" ID="Button15" Text="Button 15" CssClass="btn btn-primary" />
            <asp:Button runat="server" ID="Button16" Text="Button 16" CssClass="btn btn-primary" />
            <asp:Button runat="server" ID="Button17" Text="Button 17" CssClass="btn btn-primary" />
            <asp:Button runat="server" ID="Button18" Text="Button 18" CssClass="btn btn-primary" />
            <asp:Button runat="server" ID="Button19" Text="Button 19" CssClass="btn btn-primary" />
            <asp:Button runat="server" ID="Button20" Text="Button 20" CssClass="btn btn-primary" />
            <asp:Button runat="server" ID="Button21" Text="Button 21" CssClass="btn btn-primary" />
            <asp:Button runat="server" ID="Button22" Text="Button 22" CssClass="btn btn-primary" />
            <asp:Button runat="server" ID="Button23" Text="Button 23" CssClass="btn btn-primary" />
            <asp:Button runat="server" ID="Button24" Text="Button 24" CssClass="btn btn-primary" />

/* Styling for the container to hold the buttons in 2 columns */
        .container {
            display: grid;
            grid-template-columns: 1fr 1fr; /* 2 columns */
            gap: 10px; /* Gap between the buttons */
            max-width: 500px; /* Set a max-width for the container */
        }

        /* Styling for the buttons to ensure they are wide enough */
        .btn {
            width: 200px; /* Set button width to 200px */
            margin-bottom: 10px; /* Add some space between buttons */
        }

        /* Optional: Centering text inside the buttons */
        .btn {
            display: flex;
            justify-content: center;
            align-items: center;
        }
