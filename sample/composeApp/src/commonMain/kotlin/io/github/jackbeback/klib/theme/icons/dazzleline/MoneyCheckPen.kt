package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MoneyCheckPen: ImageVector
    get() {
        if (_MoneyCheckPen != null) {
            return _MoneyCheckPen!!
        }
        _MoneyCheckPen = ImageVector.Builder(
            name = "MoneyCheckPen",
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
                moveTo(7f, 14f)
                horizontalLineTo(12.5f)
                moveTo(7f, 10f)
                horizontalLineTo(17f)
                moveTo(10f, 19f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 19f, 4.52f, 19f, 4.092f, 18.782f)
                curveTo(3.716f, 18.59f, 3.41f, 18.284f, 3.218f, 17.908f)
                curveTo(3f, 17.48f, 3f, 16.92f, 3f, 15.8f)
                verticalLineTo(8.2f)
                curveTo(3f, 7.08f, 3f, 6.52f, 3.218f, 6.092f)
                curveTo(3.41f, 5.716f, 3.716f, 5.41f, 4.092f, 5.218f)
                curveTo(4.52f, 5f, 5.08f, 5f, 6.2f, 5f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 5f, 19.48f, 5f, 19.908f, 5.218f)
                curveTo(20.284f, 5.41f, 20.59f, 5.716f, 20.782f, 6.092f)
                curveTo(21f, 6.52f, 21f, 7.08f, 21f, 8.2f)
                verticalLineTo(8.5f)
                moveTo(14f, 20f)
                lineTo(16.025f, 19.595f)
                curveTo(16.201f, 19.56f, 16.29f, 19.542f, 16.372f, 19.51f)
                curveTo(16.445f, 19.481f, 16.515f, 19.444f, 16.579f, 19.399f)
                curveTo(16.652f, 19.348f, 16.715f, 19.285f, 16.843f, 19.157f)
                lineTo(21f, 15f)
                curveTo(21.552f, 14.448f, 21.552f, 13.552f, 21f, 13f)
                curveTo(20.448f, 12.448f, 19.552f, 12.448f, 19f, 13f)
                lineTo(14.843f, 17.157f)
                curveTo(14.715f, 17.285f, 14.652f, 17.348f, 14.601f, 17.421f)
                curveTo(14.556f, 17.485f, 14.519f, 17.555f, 14.49f, 17.628f)
                curveTo(14.458f, 17.71f, 14.44f, 17.799f, 14.405f, 17.975f)
                lineTo(14f, 20f)
                close()
            }
        }.build()

        return _MoneyCheckPen!!
    }

@Suppress("ObjectPropertyName")
private var _MoneyCheckPen: ImageVector? = null
