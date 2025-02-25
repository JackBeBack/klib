package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.StarAlt4: ImageVector
    get() {
        if (_StarAlt4 != null) {
            return _StarAlt4!!
        }
        _StarAlt4 = ImageVector.Builder(
            name = "StarAlt4",
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
                moveTo(12f, 3f)
                lineTo(13.43f, 8.312f)
                curveTo(13.605f, 8.96f, 13.692f, 9.284f, 13.864f, 9.549f)
                curveTo(14.017f, 9.783f, 14.217f, 9.983f, 14.451f, 10.136f)
                curveTo(14.716f, 10.308f, 15.04f, 10.395f, 15.688f, 10.57f)
                lineTo(21f, 12f)
                lineTo(15.688f, 13.43f)
                curveTo(15.04f, 13.605f, 14.716f, 13.692f, 14.451f, 13.864f)
                curveTo(14.217f, 14.017f, 14.017f, 14.217f, 13.864f, 14.451f)
                curveTo(13.692f, 14.716f, 13.605f, 15.04f, 13.43f, 15.688f)
                lineTo(12f, 21f)
                lineTo(10.57f, 15.688f)
                curveTo(10.395f, 15.04f, 10.308f, 14.716f, 10.136f, 14.451f)
                curveTo(9.983f, 14.217f, 9.783f, 14.017f, 9.549f, 13.864f)
                curveTo(9.284f, 13.692f, 8.96f, 13.605f, 8.312f, 13.43f)
                lineTo(3f, 12f)
                lineTo(8.312f, 10.57f)
                curveTo(8.96f, 10.395f, 9.284f, 10.308f, 9.549f, 10.136f)
                curveTo(9.783f, 9.983f, 9.983f, 9.783f, 10.136f, 9.549f)
                curveTo(10.308f, 9.284f, 10.395f, 8.96f, 10.57f, 8.312f)
                lineTo(12f, 3f)
                close()
            }
        }.build()

        return _StarAlt4!!
    }

@Suppress("ObjectPropertyName")
private var _StarAlt4: ImageVector? = null
