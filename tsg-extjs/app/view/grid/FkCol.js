Ext.define('TelosysGen.view.grid.FkCol', {
    extend: 'TelosysGen.view.grid.gen.FkColGen',
    xtype: 'fkcol-grid',
    initComponent: function () {
        this.callParent();
        this.getDockedComponent('gridtbar').add(
            {
                xtype: 'tbar.table.combo',
                urlSearchApiPath: '/search/findByFk_Table_IdTable',
            }
        )
    }
});
