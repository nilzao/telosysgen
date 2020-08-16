Ext.define('TelosysGen.view.grid.LinkJoincolumn', {
    extend: 'TelosysGen.view.grid.gen.LinkJoincolumnGen',
    xtype: 'linkjoincolumn-grid', initComponent: function () {
        this.callParent();
        this.getDockedComponent('gridtbar').add(
            {
                xtype: 'tbar.table.combo',
                urlSearchApiPath: '/search/findByLink_Table_IdTable',
            }
        )
    }
});
