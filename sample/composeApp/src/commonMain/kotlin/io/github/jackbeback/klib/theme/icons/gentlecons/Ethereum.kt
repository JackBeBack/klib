package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Ethereum: ImageVector
    get() {
        if (_Ethereum != null) {
            return _Ethereum!!
        }
        _Ethereum = ImageVector.Builder(
            name = "Ethereum",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 3.208f)
                lineTo(6.979f, 10.16f)
                lineTo(12f, 12.864f)
                lineTo(17.021f, 10.16f)
                lineTo(12f, 3.208f)
                close()
                moveTo(11.027f, 1.139f)
                curveTo(11.506f, 0.476f, 12.494f, 0.476f, 12.973f, 1.139f)
                lineTo(19.177f, 9.73f)
                curveTo(19.602f, 10.318f, 19.412f, 11.145f, 18.773f, 11.489f)
                lineTo(12.569f, 14.829f)
                curveTo(12.214f, 15.021f, 11.786f, 15.021f, 11.431f, 14.829f)
                lineTo(5.227f, 11.489f)
                curveTo(4.588f, 11.145f, 4.398f, 10.318f, 4.823f, 9.73f)
                lineTo(11.027f, 1.139f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.71f, 13.527f)
                curveTo(18.869f, 12.947f, 19.997f, 14.363f, 19.173f, 15.363f)
                lineTo(12.926f, 22.948f)
                curveTo(12.446f, 23.531f, 11.554f, 23.531f, 11.074f, 22.948f)
                lineTo(4.827f, 15.363f)
                curveTo(4.003f, 14.363f, 5.131f, 12.947f, 6.29f, 13.527f)
                lineTo(12f, 16.382f)
                lineTo(17.71f, 13.527f)
                close()
                moveTo(16f, 16.5f)
                lineTo(12.537f, 18.35f)
                curveTo(12.199f, 18.519f, 11.801f, 18.519f, 11.463f, 18.35f)
                lineTo(8f, 16.5f)
                lineTo(12f, 20.927f)
                lineTo(16f, 16.5f)
                close()
            }
        }.build()

        return _Ethereum!!
    }

@Suppress("ObjectPropertyName")
private var _Ethereum: ImageVector? = null
