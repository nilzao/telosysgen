Ext.define('TelosysGen.view.grid.Column', {
    extend: 'TelosysGen.view.grid.gen.ColumnGen',
    xtype: 'column-grid',
    initComponent: function () {
        this.callParent();
        this.getDockedComponent('gridtbar').add(
            {xtype: 'tbar.table.combo'}
        )
    }
});
