Ext.define('TelosysGen.view.grid.Fk', {
    extend: 'TelosysGen.view.grid.gen.FkGen',
    xtype: 'fk-grid',
    initComponent: function () {
        this.callParent();
        this.getDockedComponent('gridtbar').add(
            {xtype: 'tbar.table.combo'}
        )
    }
});
