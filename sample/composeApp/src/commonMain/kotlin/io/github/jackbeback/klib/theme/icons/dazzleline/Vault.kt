package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Vault: ImageVector
    get() {
        if (_Vault != null) {
            return _Vault!!
        }
        _Vault = ImageVector.Builder(
            name = "Vault",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 19f)
                verticalLineTo(21f)
                moveTo(17f, 19f)
                verticalLineTo(21f)
                moveTo(17f, 11f)
                curveTo(17.552f, 11f, 18f, 10.552f, 18f, 10f)
                curveTo(18f, 9.448f, 17.552f, 9f, 17f, 9f)
                curveTo(16.448f, 9f, 16f, 9.448f, 16f, 10f)
                curveTo(16f, 10.552f, 16.448f, 11f, 17f, 11f)
                close()
                moveTo(17f, 11f)
                verticalLineTo(14f)
                moveTo(17f, 10f)
                horizontalLineTo(17.01f)
                moveTo(9.5f, 11.5f)
                horizontalLineTo(9.51f)
                moveTo(13f, 11.5f)
                curveTo(13f, 13.433f, 11.433f, 15f, 9.5f, 15f)
                curveTo(7.567f, 15f, 6f, 13.433f, 6f, 11.5f)
                curveTo(6f, 9.567f, 7.567f, 8f, 9.5f, 8f)
                curveTo(11.433f, 8f, 13f, 9.567f, 13f, 11.5f)
                close()
                moveTo(7.8f, 19f)
                horizontalLineTo(16.2f)
                curveTo(17.88f, 19f, 18.72f, 19f, 19.362f, 18.673f)
                curveTo(19.927f, 18.385f, 20.385f, 17.927f, 20.673f, 17.362f)
                curveTo(21f, 16.72f, 21f, 15.88f, 21f, 14.2f)
                verticalLineTo(8.8f)
                curveTo(21f, 7.12f, 21f, 6.28f, 20.673f, 5.638f)
                curveTo(20.385f, 5.074f, 19.927f, 4.615f, 19.362f, 4.327f)
                curveTo(18.72f, 4f, 17.88f, 4f, 16.2f, 4f)
                horizontalLineTo(7.8f)
                curveTo(6.12f, 4f, 5.28f, 4f, 4.638f, 4.327f)
                curveTo(4.074f, 4.615f, 3.615f, 5.074f, 3.327f, 5.638f)
                curveTo(3f, 6.28f, 3f, 7.12f, 3f, 8.8f)
                verticalLineTo(14.2f)
                curveTo(3f, 15.88f, 3f, 16.72f, 3.327f, 17.362f)
                curveTo(3.615f, 17.927f, 4.074f, 18.385f, 4.638f, 18.673f)
                curveTo(5.28f, 19f, 6.12f, 19f, 7.8f, 19f)
                close()
            }
        }.build()

        return _Vault!!
    }

@Suppress("ObjectPropertyName")
private var _Vault: ImageVector? = null
