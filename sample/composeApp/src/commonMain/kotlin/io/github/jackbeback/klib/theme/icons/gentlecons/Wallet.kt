package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Wallet: ImageVector
    get() {
        if (_Wallet != null) {
            return _Wallet!!
        }
        _Wallet = ImageVector.Builder(
            name = "Wallet",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(20f, 15f)
                curveTo(20.552f, 15f, 21f, 14.552f, 21f, 14f)
                curveTo(21f, 13.448f, 20.552f, 13f, 20f, 13f)
                curveTo(19.448f, 13f, 19f, 13.448f, 19f, 14f)
                curveTo(19f, 14.552f, 19.448f, 15f, 20f, 15f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.775f, 0.985f)
                curveTo(18.492f, 0.461f, 20.282f, 1.551f, 20.603f, 3.318f)
                lineTo(20.936f, 5.149f)
                curveTo(22.135f, 5.542f, 23f, 6.67f, 23f, 8f)
                verticalLineTo(10.764f)
                curveTo(23.614f, 11.313f, 24f, 12.111f, 24f, 13f)
                verticalLineTo(15f)
                curveTo(24f, 15.889f, 23.614f, 16.687f, 23f, 17.236f)
                verticalLineTo(20f)
                curveTo(23f, 21.657f, 21.657f, 23f, 20f, 23f)
                horizontalLineTo(4f)
                curveTo(2.343f, 23f, 1f, 21.657f, 1f, 20f)
                verticalLineTo(8f)
                curveTo(1f, 6.513f, 2.082f, 5.279f, 3.501f, 5.041f)
                lineTo(16.775f, 0.985f)
                close()
                moveTo(21f, 16f)
                curveTo(21.552f, 16f, 22f, 15.552f, 22f, 15f)
                verticalLineTo(13f)
                curveTo(22f, 12.448f, 21.552f, 12f, 21f, 12f)
                horizontalLineTo(18f)
                curveTo(17.448f, 12f, 17f, 12.448f, 17f, 13f)
                verticalLineTo(15f)
                curveTo(17f, 15.552f, 17.448f, 16f, 18f, 16f)
                horizontalLineTo(21f)
                close()
                moveTo(21f, 18f)
                verticalLineTo(20f)
                curveTo(21f, 20.552f, 20.552f, 21f, 20f, 21f)
                horizontalLineTo(4f)
                curveTo(3.448f, 21f, 3f, 20.552f, 3f, 20f)
                verticalLineTo(8f)
                curveTo(3f, 7.448f, 3.448f, 7f, 4f, 7f)
                horizontalLineTo(20f)
                curveTo(20.55f, 7f, 20.996f, 7.444f, 21f, 7.993f)
                lineTo(21f, 10f)
                horizontalLineTo(18f)
                curveTo(16.343f, 10f, 15f, 11.343f, 15f, 13f)
                verticalLineTo(15f)
                curveTo(15f, 16.657f, 16.343f, 18f, 18f, 18f)
                horizontalLineTo(21f)
                close()
                moveTo(18.695f, 3.607f)
                lineTo(18.941f, 5f)
                horizontalLineTo(10f)
                lineTo(17.423f, 2.823f)
                curveTo(17.997f, 2.651f, 18.591f, 3.018f, 18.695f, 3.607f)
                close()
            }
        }.build()

        return _Wallet!!
    }

@Suppress("ObjectPropertyName")
private var _Wallet: ImageVector? = null
